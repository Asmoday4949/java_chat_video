
package ch.hearc.cours.kitbase.array;

import ch.hearc.cours.kitbase.tools.Tab1DTools;

public class UseTab1D
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
		int taille = 25;

		double[] tab1 = new double[taille];
		double[] tab2 = new double[taille];

		Tab1DTools.peupler(tab1);
		Tab1DTools.peupler(tab2);

		double[] tabAddition = Tab1DTools.add(tab1, tab2);
		Tab1DTools.print(tabAddition);
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/



	}

