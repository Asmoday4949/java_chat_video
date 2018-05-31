
package ch.hearc.cours.videochat.ui;

import ch.hearc.cours.videochat.network.server.PCServer;
import ch.hearc.cours.videochat.webcam.WebcamRemote;

public class ServiceRMI
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	private ServiceRMI()
		{

		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	public void connect(String nickname, String ip, int port)
		{
		PCServer.getInstance();
		WebcamRemote.getInstance();
		}

	/*------------------------------*\
	|*				Set				*|
	\*------------------------------*/

	/*------------------------------*\
	|*				Get				*|
	\*------------------------------*/

	public static synchronized ServiceRMI getInstance()
		{
		if (instance == null)
			{
			instance = new ServiceRMI();
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

	private static ServiceRMI instance;
	}
