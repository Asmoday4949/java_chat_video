
package ch.hearc.cours.kitbase.quadratique;

public class UseQuadratiqueProprieteesSystemes
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
		useProprieteeSysteme();
		useQuadratique();
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	private static void useQuadratique()
		{
		try
			{
			double a = Double.valueOf(System.getProperty("a"));
			double b = Double.valueOf(System.getProperty("b"));
			double c = Double.valueOf(System.getProperty("c"));

			double[] tabX = Quadratique.solve(a, b, c);
			Quadratique.print(a, b, c, tabX);
			}
		catch (NumberFormatException e)
			{
			System.err.println("Mode d'emploi de la commande");
			System.exit(-1); // 0 normal, -1 anormal
			}
		}

	private static void useProprieteeSysteme()
		{
		String name = System.getProperty("user.name");
		System.out.println(name);
		}
	}
