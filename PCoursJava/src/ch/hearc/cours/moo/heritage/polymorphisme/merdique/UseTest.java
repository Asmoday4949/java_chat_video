
package ch.hearc.cours.moo.heritage.polymorphisme.merdique;

public class UseTest
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
		MoyenTransport moyenTransport = new MoyenTransport();
		System.out.println(moyenTransport.nameHierarchie());
		Voiture voiture = new Voiture();
		System.out.println(voiture.nameHierarchie());
		Ferari farari = new Ferari();
		System.out.println(farari.nameHierarchie());
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	}
