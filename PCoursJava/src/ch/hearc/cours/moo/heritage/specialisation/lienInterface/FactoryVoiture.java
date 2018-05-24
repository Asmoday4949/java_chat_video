
package ch.hearc.cours.moo.heritage.specialisation.lienInterface;

import ch.hearc.cours.moo.heritage.specialisation.lienInterface.implementation.ferrari.Ferrari;
import ch.hearc.cours.moo.heritage.specialisation.lienInterface.specification.Voiture_I;

public class FactoryVoiture
	{

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	public static Voiture_I create()
		{
		//return null;	//On ne connait pas encore la classe voiture mais permet quand meme de compiler
		//return new Toyota();
		return new Ferrari();
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	}
