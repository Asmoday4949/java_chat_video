
package ch.hearc.cours.moo.enumeration;

/**
 * JANVIER est une instance de la classe Mois
 * FEVRIER est une instance de la classe Mois
 * ...
 * La classe Mois a exactement 12 instances, pas une plus, pas une de moins, 12 est fix !
 * Les 12 instances sont predefinies a l'avance
 */
public enum Mois
	{
//
JANVIER(1),
//
FEVRIER(2),
//
MARS(3),
//
AVRIL(4),
//
MAI(5),
//
JUIN(6),
//
JUILLET(7),
//
AOUT(8),
//
SEPTEMBRE(9),
//
OCTOBRE(10),
//
NOVEMBRE(11),
//
DECEMBRE(12);

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	private Mois(int index)
		{
		this.index = index;
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	/*------------------------------*\
	|*				Get				*|
	\*------------------------------*/

	public int getIndex()
		{
		return this.index;
		}

	/*------------------------------*\
	|*			  Static			*|
	\*------------------------------*/

	public static Mois fromIndex(int i) throws Exception
		{
		for(Mois mois:Mois.values())
			{
			if (mois.index == i) { return mois; }
			}
		throw new Exception("index hors-limites " + i);
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	//Input, Output
	private int index;
	}
