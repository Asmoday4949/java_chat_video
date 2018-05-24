
package ch.hearc.cours.moo.heritage.specialisation.lienInterface.implementation.toyota;

import ch.hearc.cours.moo.heritage.specialisation.lienInterface.implementation.Voiture_A;

public class Toyota extends Voiture_A
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public Toyota()
		{
		super("Toyota");
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	@Override
	public void avancer(float x)
		{
		System.out.println("Avancer de " + x);
		}

	/*------------------------------*\
	|*				Set				*|
	\*------------------------------*/

	/*------------------------------*\
	|*				Get				*|
	\*------------------------------*/

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/
	}
