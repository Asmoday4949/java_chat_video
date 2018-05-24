
package ch.hearc.cours.kitbase.container;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.junit.Assert;

public class UseList
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
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	private static void use1()
		{
		int n = 5;
		//ArrayList<Double> list = new ArrayList<Double>(); //Mauvaise strat�gie, peu flexible
		//List<Double> list = new ArrayList<Double>(n); //Bonne strat�gie, permet facilement de passer de Arraylist � LinkedList sans modifier peupler et print. n pas n�cessaire, juste optimisation
		List<Double> list = new LinkedList<Double>();
		List<Double> listx = new LinkedList<Double>();
		List<Double> listy = new ArrayList<Double>(n);
		peupler(list, n);
		peupler(listx, n);
		peupler(listy, n);
		//print(list);
		print(listx, listy);
		}

	private static void use2()
		{
		List<Integer> list = Arrays.asList(1, 2, 3); //permet de creer rapidement une liste en 1 ligne
		for(Integer integer:list)
			{
			System.out.println(integer);
			}
		System.out.println(list);
		}

	private static void print(List<Double> list)
		{
		//v1 : Mus�e des horreurs : Complexit� quadratique si LinkedList se cache derri�re List : performances catastrophiques !
			{
			int n = list.size();
			for(int i = 0; i < n; i++)
				{
				System.out.println(list.get(i));
				}
			}

		//v2 : Effet m�moire threadsafe, complexit� lin�aire
			{
			Iterator<Double> it = list.iterator();
			while(it.hasNext())
				{
				//Double element = it.next();
				double element = it.next(); //unboxing automatique Double->double
				System.out.println(element);
				}
			}

		//v3 : Pas d'indice, courte, la plus pratique pour un affichage custom
			{
			for(double element:list)
				{
				System.out.println(element);
				}
			}

		//V4 : La plus pratique si pas d'affichage custom n�cessaire
			{
			System.out.println(list.toString());
			}

		//v5 : Raccourcis syntaxique de V4
			{
			System.out.println(list);
			}

		}

	/**
	 * hyp: taille de listx = taille de listy
	 */
	private static void print(List<Double> listx, List<Double> listy)
		{
		Assert.assertTrue(listx.size()==listy.size());
		//V1 : Avec un while + deux iterateurs
			{
			Iterator<Double> itx = listx.iterator();
			Iterator<Double> ity = listy.iterator();
			while(itx.hasNext())
				{
				System.out.println(itx.next() + "\t" + ity.next());
				}
			}

		//v2 : Avec un foreach + un iterateur
			{
			Iterator<Double> ity = listy.iterator();
			for(Double x:listx)
				{
				//V1
				//double y = ity.next().doubleValue();
				//V2
				Double y = ity.next();
				//V3
				//double y = ity.next();

				System.out.println(x + "\t" + y);
				}
			}
		}

	private static void peupler(List<Double> list, int n)
		{
		for(int i = 1; i <= n; i++)
			{
			list.add(Math.PI * i);
			}
		}
	}
