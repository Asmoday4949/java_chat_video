
package ch.hearc.cours.advanced.rmi.pcsecret;

import java.rmi.RemoteException;

public class Secret implements Secret_I
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	private Secret()
		{
		//Rien
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	public synchronized static Secret getInstance()
		{
		if (instance == null)
			{
			instance = new Secret();
			}
		return instance;
		}

	/*------------------------------*\
	|*				Get				*|
	\*------------------------------*/

	@Override
	public String getSecret() throws RemoteException
		{
		return SECRET;
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	//Tools
	private static Secret instance = null;

	/*------------------------------*\
	|*			  Static			*|
	\*------------------------------*/

	private static final String SECRET = "An amazing secret";

	}
