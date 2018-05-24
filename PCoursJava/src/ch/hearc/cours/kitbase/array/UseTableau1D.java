
package ch.hearc.cours.kitbase.array;

public class UseTableau1D
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
		//C++
		//			{
		//			double* tab = new double[3]; //Tableau sur le tas
		//			double tab2[3]; //Tableau sur la pile
		//			}
		//Java
			{
			double[] tab = new double[3]; //En java forcement sur le tas pas d'autre moyen
			peupler(tab);
			print(tab);
			}
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	private static void peupler(double[] tab)
		{
		int n = tab.length;
		for(int i = 0; i < n; i++)
			{
			tab[i] = i + 1;
			}
		}

	private static void print(double[] tab)
		{
		for(int i = 0; i < tab.length; i++)
			{
			System.out.println(tab[i]);
			}
		}

	}
