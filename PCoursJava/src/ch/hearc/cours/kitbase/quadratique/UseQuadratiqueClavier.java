
package ch.hearc.cours.kitbase.quadratique;

import com.bilat.tools.io.console.Clavier;

public class UseQuadratiqueClavier
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
		double[] tabABC = saisirABC();
		double[] tabResultats = Quadratique.solve(tabABC[0], tabABC[1], tabABC[2]);
		Quadratique.print(tabABC[0], tabABC[1], tabABC[2], tabResultats);
		}

	private static double[] saisirABC()
		{
		double a;
		do
			{
			a = Clavier.lireDouble("a = ");
			} while(a == 0);

		double b = Clavier.lireDouble("b = ");
		double c = Clavier.lireDouble("c = ");

		double[] tabABC = { a, b, c };

		return tabABC;
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	}
