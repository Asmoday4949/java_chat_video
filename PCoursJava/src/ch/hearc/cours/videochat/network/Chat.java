
package ch.hearc.cours.videochat.network;

import java.rmi.RemoteException;
import java.security.PublicKey;

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
		if(webcamImage != null)
			{
			System.out.println("Write image code");
			ServiceGUI.getInstance().writeImage(webcamImage.getImage());
			}
		}

	@Override
	public void writeMessage(Message message) throws RemoteException
		{
		System.out.println("Write message");
		ServiceGUI.getInstance().writeMessage(message.getString());
		}

	@Override
	public void writePublicKey(PublicKey key)
		{
		System.out.println("Write public key");
		ServiceRMI.getInstance().setPublicKey(key);
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

	public static String getPublicKey()
		{
		return null;
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
	private static Chat instance = null;

	}
