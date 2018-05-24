
package ch.hearc.cours.moo.tri;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class UseHumain
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
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	private static void use1()
		{
		List<Humain> listHumain = create(8);
		System.out.println(listHumain);

		//V1
			{
			Comparator<Humain> humainComparatorCroissant = new HumainComparatorCroissant();
			Collections.sort(listHumain, humainComparatorCroissant); //Tri surplace
			System.out.println(listHumain);

			Comparator<Humain> humainComparatorDecroissant = new HumainComparatorDecroissant();
			Collections.sort(listHumain, humainComparatorDecroissant); //Tri surplace
			System.out.println(listHumain);
			}

		//V2 : Classes internes anonymes
			{
			Comparator<Humain> comparatorCroissant = new Comparator<Humain>()
				{

				@Override
				public int compare(Humain h1, Humain h2)
					{
					if (!h1.getNom().equals(h2.getNom()))
						{
						return h1.getNom().compareTo(h2.getNom());
						}
					else
						{
						return Integer.compare(h1.getAge(), h2.getAge());
						}
					}
				};

			Comparator<Humain> comparatorDecroissant = new Comparator<Humain>()
				{

				@Override
				public int compare(Humain h1, Humain h2)
					{
					return -1 * comparatorCroissant.compare(h1, h2);
					}
				};

			Collections.sort(listHumain, comparatorCroissant); //Tri surplace
			System.out.println(listHumain);
			Collections.sort(listHumain, comparatorDecroissant); //Tri surplace
			System.out.println(listHumain);
			Collections.sort(listHumain); //Pas tres pratique car on subit le comparateur de la classe humain.
			System.out.println(listHumain); //La methode avec classe interne anonnyme est plus flexible et permet de definir un comparateur adapte a nos besoins
			}
		}

	private static List<Humain> create(int n)
		{
		List<Humain> list = new ArrayList<Humain>();
		Random random = new Random();
		for(int i = 0; i < n; i++)
			{
			int a = random.nextInt(10);
			int b = random.nextInt(10);
			Humain humain = new Humain("h" + a, b);
			list.add(humain);
			}

		return list;
		}

	}
