
package ch.hearc.cours.advanced.rmi.pchorloge;

import org.junit.Assert;

import ch.hearc.cours.advanced.rmi.pcsecret.Secret_I;

public class SecretRemote
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	private SecretRemote()
		{
		//Rien
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	/*------------------------------*\
	|*				Get				*|
	\*------------------------------*/

	public Secret_I getSecret()
		{
		return horlogeRemote;
		}

	/*------------------------------*\
	|*			  Static			*|
	\*------------------------------*/

	/**
	 * A appeler une seule fois et avant le getInstance!!!
	 */
	public synchronized static void init(Secret_I secretRemote)
		{
		Assert.assertTrue(instance == null);
		SecretRemote.horlogeRemote = secretRemote;
		}

	/**
	 * A appeler exactement une fois INIT avant
	 */
	public synchronized static SecretRemote getInstance()
		{
		if (instance == null)
			{
			Assert.assertTrue(horlogeRemote != null);
			instance = new SecretRemote();
			}
		return instance;
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	/*------------------------------*\
	|*			  Static			*|
	\*------------------------------*/

	private static Secret_I horlogeRemote;
	private static SecretRemote instance = null;

	}
