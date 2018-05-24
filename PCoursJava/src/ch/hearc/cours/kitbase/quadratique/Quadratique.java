
package ch.hearc.cours.kitbase.quadratique;

import org.junit.Assert;

public class Quadratique
	{

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	/**
	 * Le tableau a autant de case que de solutions, ie 2, 1 ou 0
	 * hyp: a!=0
	 */
	public static double[] solve(double a, double b, double c)
		{
		Assert.assertTrue(a != 0);
		//		double discriminant = discriminant(a, b, c);
		//		if (discriminant > 0)
		//			{
		//			double[] tabX = new double[2];
		//			tabX[0] = (-b + Math.sqrt(discriminant)) / 2 / a;
		//			tabX[1] = (-b - Math.sqrt(discriminant)) / 2 / a;
		//			return tabX;
		//			}
		//		else if (discriminant == 0)
		//			{
		//			double[] tabX = new double[1];
		//			tabX[0] = -b / 2 / a;
		//			return tabX;
		//			}
		//		else
		//			{
		//			double[] tabX = new double[0];
		//			return tabX;
		//			}

		double discriminant = discriminant(a, b, c);
		if (discriminant > 0)
			{
			double x1 = (-b + Math.sqrt(discriminant)) / 2 / a;
			double x2 = (-b - Math.sqrt(discriminant)) / 2 / a;
			return new double[] { x1, x2 };
			}
		else if (discriminant == 0)
			{
			return new double[] { -b / 2 / a };
			}
		else
			{
			return new double[0];
			}
		}

	public static double discriminant(double a, double b, double c)
		{
		return b * b - 4 * a * c;
		}

	public static void print(double a, double b, double c, double[] tabX)
		{
		System.out.println(a + "x^2 + " + b + "x + " + c + " = 0 ssi");
		for(int i = 0; i < tabX.length; i++)
			{
			System.out.println("x" + (i + 1) + " = " + tabX[i]);
			}
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/
	}
