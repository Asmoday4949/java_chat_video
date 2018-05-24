
package ch.hearc.cours.kitbase.container;

import java.util.Arrays;

/**
 *
 * @author matteo.baldi
 *
 */
public class UseTab
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
		use1();
		use2();
		use3();
		use4bad();
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	private static void use1()
		{
		int n = 5;
		double[] tab = new double[n];
		peupler(tab);
		print(tab);
		}

	private static void use2()
		{
		double[] tab = new double[] { 1, 2, 3 };
		System.out.println(Arrays.toString(tab));
		}

	/**
	 *A <b>connaitre</b>!!!
	 */
	private static void use3()
		{
		int[] tab = { 1, 2, 3 };
		System.out.println(Arrays.toString(tab));
		}

	/**
	 * Musee des horreurs !
	 */
	private static void use4bad()
		{
		int[] tab1 = { 1, 2, 3 };
		int[] tab2 = { 10, 20, 30 };
		int[] tab3 = new int[3];
		tab3 = add(tab1, tab2);
		System.out.println(Arrays.toString(tab3));
		}

	private static void use4good()
		{
		int[] tab1 = { 1, 2, 3 };
		int[] tab2 = { 10, 20, 30 };
		int[] tab3 = add(tab1, tab2);
		System.out.println(Arrays.toString(tab3));
		}

	private static int[] add(int[] tab1, int[] tab2)
		{
		int n = tab1.length;
		int[] tabResultat = new int[n];

		//V1
			{
			for(int i = 0; i < n; i++)
				{
				tabResultat[i] = tab1[i] + tab2[i];
				}
			}

		//V2
		//			{
		//			int i = 0;
		//			for(int valeur2:tab2)
		//				{
		//				int valeur1 = tab1[i];
		//				tabResultat[i] = valeur1 + valeur2;
		//				i++;
		//				}
		//			}
		return tabResultat;
		}

	private static void print(double[] tab)
		{
		//v1
			{
			for(int i = 0; i < tab.length; i++)
				{
				System.out.println(tab[i]);
				}
			}

		//v2
			{
			for(double valeur:tab)
				{
				System.out.println(valeur);
				}
			}

		//v3 : pas fonctionnelle, car tab pas vrai objet
			{
			System.out.println(tab);
			}

		//v4 : a connaitre
			{
			System.out.println(Arrays.toString(tab));
			}

		//v5 : chaos pour l'affichage
			{
			System.out.println(Arrays.asList(tab).toString());
			}
		}

	private static void peupler(double[] tab)
		{
		for(int i = 0; i < tab.length; i++)
			{
			tab[i] = i * Math.E;
			}
		}
	}
