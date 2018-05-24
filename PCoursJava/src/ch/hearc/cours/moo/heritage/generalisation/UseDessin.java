
package ch.hearc.cours.moo.heritage.generalisation;

public class UseDessin
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
		Dessin dessin = new Dessin("Joli Dessin");
		dessin.add(new Rectangle("Joli rectangle", 10, 20));
		dessin.add(new Carre("Joli carré", 100));
		System.out.println("Aire du dessin : " + dessin.aire());
		System.out.println("\nPerimetre du dessin : " + dessin.perimetre());
		System.out.println("\nIndice Goloviatinski du dessin : " + dessin.indiceGoloviatinski());
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	}
