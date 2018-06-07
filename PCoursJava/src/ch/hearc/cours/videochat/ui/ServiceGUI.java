
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
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	public synchronized void writeImage(BufferedImage image)
		{
		jFrameChat.getMain().getJWebcam().getJWebcamImage().setImage(image);
		}

	public synchronized void writeMessage(String message)
		{
		jFrameChat.getMain().getJChat().appendText(message);
		}

	public void connect(String nickname, String ip, int port)
		{
		jFrameChat.getMain().showJDisconnection(true);
		ServiceRMI.getInstance().connect(ip, port);
		new Thread(() -> {
		startWebcam();
		}).start();
		}

	public void startWebcam()
		{
		ServiceWebcam.getInstance().open();
		ServiceRMI.getInstance().startSendWebcam();
		}

	public void stopWebcam()
		{
		ServiceRMI.getInstance().stopSendWebcam();
		ServiceWebcam.getInstance().close();
		}

	public void sendMessage(String message)
		{
		jFrameChat.getMain().getJChat().appendText(message);
		ServiceRMI.getInstance().writeMessage(message);
		}

	public void disconnected()
		{

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

	}
