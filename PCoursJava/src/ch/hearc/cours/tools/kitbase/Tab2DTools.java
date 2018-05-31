
package ch.hearc.cours.tools.kitbase;

public class Tab2DTools
	{

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	/**
	 * L'implementation est generale et permet de faire ensuite des variations interessantes
	 * cf createTriangular createCustom
	 *
	 * en pratique
	 *
	 * 		double[][] tab2D = new double[n][m];
	 */
	public static double[][] create(int n, int m)
		{
		double[][] tabExtern = new double[n][];
		for(int i = 0; i < n; i++)
			{
			double[] tabLigne = new double[m];
			tabExtern[i] = tabLigne;
			}

		return tabExtern;
		}

	public static double[][] createTriangular(int n)
		{
		double[][] tabExtern = new double[n][];
		for(int i = 0; i < n; i++)
			{
			int mi = i + 1;
			double[] tabLigne = new double[mi];
			tabExtern[i] = tabLigne;
			}

		return tabExtern;
		}

	public static double[][] createCustom(int[] tabColumnPerRow)
		{
		int n = tabColumnPerRow.length;
		double[][] tabExtern = new double[n][];

		for(int i = 0; i < n; i++)
			{
			int mi = tabColumnPerRow[i];
			double[] tabLine = new double[mi];
			tabExtern[i] = tabLine;
			}

		return tabExtern;
		}

	public static void print(double[][] tab)
		{
		int n = tab.length;
		for(int i = 0; i < n; i++)
			{
			int mi = tab[i].length;

			for(int j = 0; j < mi; j++)
				{
				System.out.print(tab[i][j]+"\t");
				}
			System.out.println();
			}
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/
	}
