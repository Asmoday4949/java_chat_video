
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
		JFrameChat jFrameChat = new JFrameChat();
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	public void writeImage(BufferedImage image)
		{
		// TODO Auto-generated method stub

		}

	public void writeMessage(String string)
		{
		// TODO Auto-generated method stub

		}

	public void connect(String nickname, String ip, int port)
		{
//		WebcamImage webcam = WebcamImage.getInstance();
//		webcam.open();

		ServiceRMI.getInstance().connect(nickname, ip, port);
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

	private static ServiceGUI instance;

	}
