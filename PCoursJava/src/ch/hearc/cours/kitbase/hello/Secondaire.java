
package ch.hearc.cours.kitbase.hello;

public class Secondaire
	{

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	public static void coucou()
		{
		//V1
			{
			coucouPrive();
			}

		//V2
			{
			Secondaire.coucouPrive();
			}
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	private static void coucouPrive()
		{
		System.out.println("coucou");
		}

	}
