
package ch.hearc.cours.kitbase.container;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class UseSet
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
		int n = 5;
		Set<Double> set = new TreeSet<Double>();
		peupler(set, n);
		print(set);
		System.out.println(set.size());
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	/**
	 * Le set garantit l'unicité et aura un taille de n ! malgré la boucle intérieure
	 */
	private static void peupler(Set<Double> set, int n)
		{
		for(int i = 1; i <= n; i++)
			{
			for(int j = 0; j < 10; j++)
				{
				set.add(Math.PI * i);
				}
			}
		}

	private static void print(Set<Double> set)
		{
		//v1 :
			{
			Iterator<Double> it = set.iterator();
			while(it.hasNext())
				{
				double element = it.next();
				System.out.println(element);
				}
			}

		//v2 :
			{
			for(Double element:set)
				{
				System.out.println(element);
				}
			}

		//v3 :
			{
			System.out.println(set);
			}
		}
	}
