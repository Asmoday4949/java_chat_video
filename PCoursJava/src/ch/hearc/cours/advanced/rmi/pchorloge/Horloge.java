
package ch.hearc.cours.advanced.rmi.pchorloge;

import java.rmi.RemoteException;
import java.util.Date;

public class Horloge implements Horloge_I
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	private Horloge()
		{
		//Rien
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	public synchronized static Horloge getInstance()
		{
		if (instance == null)
			{
			instance = new Horloge();
			}
		return instance;
		}

	/*------------------------------*\
	|*				Get				*|
	\*------------------------------*/

	@Override
	public Date getTime() throws RemoteException
		{
		return new Date();
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	private static Horloge instance = null;

	}
