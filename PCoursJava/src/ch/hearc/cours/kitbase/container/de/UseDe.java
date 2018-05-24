
package ch.hearc.cours.kitbase.container.de;

public class UseDe
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
		int nbSimulations = Integer.MAX_VALUE/100;
		useDe(6,nbSimulations);
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	private static void useDe(int tailleDe, int nbSimulations)
		{
		int nbLanceMoyen = De.simulerDe(tailleDe, nbSimulations);
		System.out.println("Nb lance moyen :"+nbLanceMoyen);
		}
	}