
package ch.hearc.cours.videochat.ui;

import ch.hearc.cours.videochat.network.client.PCClient;
import ch.hearc.cours.videochat.network.server.PCServer;
import ch.hearc.cours.videochat.webcam.WebcamImage;
import ch.hearc.cours.videochat.webcam.WebcamRemote;

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

	public void connect(String nickname, String ip, int port)
		{
		WebcamImage webcam = WebcamImage.getInstance();
		webcam.open();

		//TODO Temporary for tests
		if (nickname.equals(""))
			{
			//Server
			PCServer.getInstance();
			WebcamRemote.getInstance();
			}
		else
			{
			//Client
			PCClient.getInstance();
			WebcamRemote.getInstance();
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

	private static ServiceGUI instance;
	}
