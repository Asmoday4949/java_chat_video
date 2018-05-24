
package ch.hearc.cours.kitbase.quadratique;

import org.junit.Assert;

public class UseQuadratiqueArgsSimple
	{
	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	/**
	 * Exemple: 9 4 2 (a b c)
	 */
	public static void main(String[] args)
		{
		Assert.assertTrue(args.length == 3);

		//System.out.println(Arrays.toString(args));
		try
			{
			double a = Double.valueOf(args[0]);
			double b = Double.valueOf(args[1]);
			double c = Double.valueOf(args[2]);

			double[] tabResultats = Quadratique.solve(a, b, c);
			Quadratique.print(a, b, c, tabResultats);
			}
		catch (NumberFormatException e)
			{
			System.err.println("Mode d'emploi joli de la commande");
			System.exit(-1); // 0 normal, -1 anormal
			}
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	}
