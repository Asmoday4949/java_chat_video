
package ch.hearc.cours.moo.heritage.specialisation.lienInterface;

import ch.hearc.cours.moo.heritage.specialisation.lienInterface.specification.Voiture_I;

public class UseVoiture
	{

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	public static void main(String[] args)
		{
		main();
		}

	public static void main()
		{
		Voiture_I voiture = FactoryVoiture.create();	//Utilisation d'une facade (couple Factory-Interface)
		work(voiture);
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	private static void work(Voiture_I voiture)
		{
		voiture.avancer(100);
		System.out.println(voiture.getName());
		}

	}
