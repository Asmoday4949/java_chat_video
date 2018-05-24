
package ch.hearc.cours.advanced.thread.vecteur;

import java.util.Arrays;

public class UseAddVecteur
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
		double[] v1 = { 1, 2, 3 };
		double[] v2 = { 10, 20, 30 };

		AddVecteur addvecteur = new AddVecteur(v1, v2);

		addvecteur.run();

		double[] vResult = addvecteur.getvResult();
		System.out.println(Arrays.toString(vResult));
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	}
