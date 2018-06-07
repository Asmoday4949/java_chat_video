
package ch.hearc.cours.videochat.ui;

import java.awt.image.BufferedImage;

import ch.hearc.cours.videochat.network.ServiceRMI;
import ch.hearc.cours.videochat.webcam.ServiceWebcam;

public class ServiceGUI
	{
	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	private ServiceGUI()
		{
		jFrameChat = new JFrameChat();
		this.setState(WindowState.DISCONNECTED);
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	public synchronized void writeImage(BufferedImage image)
		{
		jFrameChat.getJMain().getJWebcam().getJWebcamImage().setDestinationImage(image);
		}

	public synchronized void writeMessage(String message)
		{
		jFrameChat.getJMain().getJChat().appendText(message);
		}

	public void connect(String nickname, String ip, int port)
		{
		jFrameChat.getJMain().showJDisconnection(true);
		ServiceRMI.getInstance().connect(ip, port, port);

		new Thread(() -> {
		startWebcam();
		}).start();
		}

	public void startWebcam()
		{
		this.setState(WindowState.WEBCAM_LOADING);
		ServiceWebcam.getInstance().open();
		this.setState(WindowState.CONNECTED);
		ServiceRMI.getInstance().startSendWebcam();
		}

	public void stopWebcam()
		{
		ServiceRMI.getInstance().stopSendWebcam();
		ServiceWebcam.getInstance().close();
		}

	public void sendMessage(String message)
		{
		jFrameChat.getJMain().getJChat().appendText(message);
		ServiceRMI.getInstance().writeMessage(message);
		}

	public void connectionIssues()
		{
		//TODO Problèmes de connexion temporaires
		this.setState(WindowState.CONNECTION_ERROR);
		System.out.println("[ServiceGUI] : disconnected : Connexions issues");
		}

	public void disconnected()
		{
		// TODO Malik -> Fin de connexion du partenaire
		this.setState(WindowState.DISCONNECTED);
		System.out.println("[ServiceGUI] : disconnected : Client disconnected");
		}

	public void setSourceWebcam(BufferedImage sourceImage)
		{
		this.jFrameChat.getJMain().getJWebcam().getJWebcamImage().setSourceImage(sourceImage);
		}

	public void setState(WindowState state)
		{
		JMain main = this.jFrameChat.getJMain();

		if(state == WindowState.CONNECTED)
			{
			main.loadJWebcam();
			}
		else
			{
			main.loadJImage();
			main.setImage(state.getImage());
			}
		}


	/*------------------------------*\
	|*				Set				*|
	\*------------------------------*/

	/*------------------------------*\
	|*				Get				*|
	\*------------------------------*/

	public static synchronized ServiceGUI getInstance()
		{
		if (instance == null)
			{
			instance = new ServiceGUI();
			}
		return instance;
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	/*------------------------------*\
	|*			  Static			*|
	\*------------------------------*/

	private JFrameChat jFrameChat;
	private static ServiceGUI instance;
	private WindowState state;

	}
