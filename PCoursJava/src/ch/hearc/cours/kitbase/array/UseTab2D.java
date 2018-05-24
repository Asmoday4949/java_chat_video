
package ch.hearc.cours.kitbase.array;

import ch.hearc.cours.kitbase.tools.Tab2DTools;

public class UseTab2D
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
		int n = 3;
		int m = 4;
		int[] tabColumnPerRow = { 1, 3, 2, 6, 4 };

		double[][] tab2DRectangular1 = Tab2DTools.create(n, m);
		double[][] tab2DRectangular2 = new double[n][m]; //equivalent à tab2DRectangular1. En pratique on prefere cette syntaxe
		double[][] tab2DTriangular = Tab2DTools.createTriangular(n);
		double[][] tab2DCustom = Tab2DTools.createCustom(tabColumnPerRow);

		fill(tab2DRectangular1);
		fill(tab2DRectangular2);
		fill(tab2DTriangular);
		fill(tab2DCustom);

		Tab2DTools.print(tab2DRectangular1);
		Tab2DTools.print(tab2DRectangular2);
		Tab2DTools.print(tab2DTriangular);
		Tab2DTools.print(tab2DCustom);
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	private static void fill(double[][] tab2d)
		{
		int s = 1;
		int n = tab2d.length;

		for(int i = 0; i < n; i++)
			{
			int mi = tab2d[i].length;

			for(int j = 0; j < mi; j++)
				{
				tab2d[i][j] = s;
				s++;
				}
			}
		}
	}
