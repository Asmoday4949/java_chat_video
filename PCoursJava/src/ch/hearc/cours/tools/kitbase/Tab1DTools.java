
package ch.hearc.cours.tools.kitbase;

import java.util.Arrays;
import java.util.Random;

import org.junit.Assert;

public class Tab1DTools
	{

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	/**
	 * Hyp. tab1 et tab2 de taille identique
	 */
	public static double[] add(double[] tab1, double[] tab2)
		{
		Assert.assertTrue(tab1.length == tab2.length);

		int n = tab1.length;

		double[] tab = new double[n];
		for(int i = 0; i < n; i++)
			{
			tab[i] = tab1[i] + tab2[i];
			}

		return tab;
		}

	/**
	 * Tient compte de l'ordre
	 */
	public static boolean isEquals(double[] tab1, double[] tab2, double epsilon)
		{
		if (tab1.length != tab2.length)
			{
			return false;
			}
		else
			{
			for(int i = 0; i < tab1.length; i++)
				{
				if (!MathTools.isEquals(tab1[i], tab2[i], epsilon)) { return false; }
				}
			}
		return true;
		}

	/**
	 * En java pas de valeurs par default dans le prototype.
	 * Solution java : Faire la doublette comme ici.
	 *
	 * Tient compte de l'ordre
	 */
	public static boolean isEquals(double[] tab1, double[] tab2)
		{
		return isEquals(tab1, tab2, 1e-6);
		}

	public static boolean isEqualsOrdered(double[] tab1, double[] tab2, double epsilon)
		{
		double[] tab1Clone = Tab1DTools.clone(tab1); //Clone car on n'a pas le droit de modifier l'orginal avec le sort qui va suivre
		double[] tab2Clone = Tab1DTools.clone(tab2);
		Arrays.sort(tab1Clone); //Algorithme sur place, modifie tab1Clone
		Arrays.sort(tab2Clone);

		return isEquals(tab1, tab2, epsilon);
		}

	public static boolean isEqualsOrdered(double[] tab1, double[] tab2)
		{
		return isEqualsOrdered(tab1, tab2, 1e-6);
		}

	public static double[] clone(double[] tab)
		{
		double[] tabClone = new double[tab.length];
		for(int i = 0; i < tab.length; i++)
			{
			tabClone[i] = tab[i];
			}
		return tabClone;
		}

	public static void peupler(double[] tab)
		{
		Random r = new Random();
		for(int i = 0; i < tab.length; i++)
			{
			tab[i] = r.nextDouble();
			}
		}

	public static void print(double[] tab)
		{
		for(int i = 0; i < tab.length; i++)
			{
			System.out.println(tab[i]);
			}
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	}
