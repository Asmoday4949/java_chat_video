
package ch.hearc.cours.moo.heritage.specialisation.lienInterface.implementation.ferrari;

import ch.hearc.cours.moo.heritage.specialisation.lienInterface.implementation.Voiture_A;

public class Ferrari extends Voiture_A
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public Ferrari()
		{
		super("Ferrari");
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	@Override
	public void avancer(float x)
		{
		System.out.println("Avancer de " + x * 10);
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
