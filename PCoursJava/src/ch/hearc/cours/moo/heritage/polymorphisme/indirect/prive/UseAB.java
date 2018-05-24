
package ch.hearc.cours.moo.heritage.polymorphisme.indirect.prive;

public class UseAB
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
		new A().m(); //Affiche A
		new B().m(); //Affiche A !
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/
	}
