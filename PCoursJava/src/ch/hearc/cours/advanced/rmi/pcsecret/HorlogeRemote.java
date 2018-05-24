
package ch.hearc.cours.advanced.rmi.pcsecret;

import org.junit.Assert;

import ch.hearc.cours.advanced.rmi.pchorloge.Horloge_I;

public class HorlogeRemote
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	private HorlogeRemote()
		{
		//Rien
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	/*------------------------------*\
	|*				Get				*|
	\*------------------------------*/

	public Horloge_I getHorloge()
		{
		return horlogeRemote;
		}

	/*------------------------------*\
	|*			  Static			*|
	\*------------------------------*/

	/**
	 * A appeler une seule fois et avant le getInstance!!!
	 */
	public synchronized static void init(Horloge_I horlogeRemote)
		{
		Assert.assertTrue(instance == null);
		HorlogeRemote.horlogeRemote = horlogeRemote;
		}

	/**
	 * A appeler exactement une fois INIT avant
	 */
	public synchronized static HorlogeRemote getInstance()
		{
		if (instance == null)
			{
			Assert.assertTrue(horlogeRemote != null);
			instance = new HorlogeRemote();
			}
		return instance;
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	/*------------------------------*\
	|*			  Static			*|
	\*------------------------------*/

	private static Horloge_I horlogeRemote;
	private static HorlogeRemote instance = null;

	}
