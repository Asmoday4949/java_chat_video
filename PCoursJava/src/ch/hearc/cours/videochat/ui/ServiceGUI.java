
package ch.hearc.cours.videochat.ui;

import java.awt.image.BufferedImage;

import ch.hearc.cours.videochat.network.ServiceRMI;

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

	public void writeImage(BufferedImage image)
		{
		jFrameChat.getMain().getJWebcam().setImage(image);
		}

	public void writeMessage(String message)
		{
		jFrameChat.getMain().getJChat().appendText(message);
		System.out.println(message);
		}

	public void connect(String nickname, String ip, int port)
		{
		//		WebcamImage webcam = WebcamImage.getInstance();
		//		webcam.open();

		ServiceRMI.getInstance().connect(ip, port);
		ServiceRMI.getInstance().startSendWebcam();
		}

	public void sendMessage(String message)
		{
		ServiceRMI.getInstance().writeMessage(message);
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
