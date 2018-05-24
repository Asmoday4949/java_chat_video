
package ch.hearc.cours.kitbase.lineaire;

import org.junit.Assert;

public class Lineaire
	{
	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	/**
	 * hyp: a != 0
	 */
	public static double solve(double a, double b)
		{
		Assert.assertTrue(a!=0);

		return -b / a;
		}

	public static void print(double a, double b, double x)
		{
		System.out.println(a + "x + " + b + " = 0 ssi x = " + x);
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/
	}
