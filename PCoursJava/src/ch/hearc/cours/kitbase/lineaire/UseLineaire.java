
package ch.hearc.cours.kitbase.lineaire;

public class UseLineaire
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
		use(3, 6);
		use(4, 2);
		//use(0,12);
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	private static void use(double a, double b)
		{
		double x = Lineaire.solve(a, b);
		Lineaire.print(a, b, x);
		System.out.println("x * 3 = " + x * 3);
		}

	}
