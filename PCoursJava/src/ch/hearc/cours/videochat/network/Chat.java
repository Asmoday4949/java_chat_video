
package ch.hearc.cours.videochat.network;

import java.rmi.RemoteException;

import ch.hearc.cours.videochat.ui.ServiceGUI;
import ch.hearc.cours.videochat.webcam.WebcamImage;

public class Chat implements Chat_I
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	private Chat()
		{
		//Rien
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	@Override
	public void writeImage(WebcamImage webcamImage) throws RemoteException
		{
		ServiceGUI.getInstance().writeImage(webcamImage.getImage());
		}

	@Override
	public void writeMessage(Message message) throws RemoteException
		{
		ServiceGUI.getInstance().writeMessage(message.getString());
		}

	/*------------------------------*\
	|*				Set				*|
	\*------------------------------*/

	/*------------------------------*\
	|*				Get				*|
	\*------------------------------*/

	public static synchronized Chat getInstance()
		{
		if (instance == null)
			{
			instance = new Chat();
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

	// Tools
	private static Chat instance;

	}
