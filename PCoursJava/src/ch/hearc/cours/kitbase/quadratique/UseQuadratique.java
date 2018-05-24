
package ch.hearc.cours.kitbase.quadratique;

public class UseQuadratique
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
		use(2, 2, -4); // 2 solutions 1;-2
		use(-3, 6,-3); // 1 solution 1
		use(1, 1, 1); // 0 solution
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	private static void use(double a, double b, double c)
		{
		double[] tabX = Quadratique.solve(a, b, c);
		Quadratique.print(a, b, c, tabX);
		}

	}
