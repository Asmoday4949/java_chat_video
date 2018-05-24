
package ch.hearc.cours.moo.tri;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Assert;

public class UseHumainSet
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
		Set<Humain> hashsetHumain = new HashSet<Humain>();
		Set<Humain> treeSetHumain = new TreeSet<Humain>();

		work(hashsetHumain);
		work(treeSetHumain);
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	private static void work(Set<Humain> set)
		{
		Humain humain1 = new Humain("humain", 1);
		Humain humain2 = new Humain("humain", 1);

		set.add(humain1);
		set.add(humain2);

		Assert.assertTrue(set.size() == 1);

		System.out.println("ok");
		}

	}
