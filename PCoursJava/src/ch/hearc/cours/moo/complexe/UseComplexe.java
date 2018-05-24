
package ch.hearc.cours.moo.complexe;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class UseComplexe
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
		//useComplexe();
		useGravite();
		//useSet();
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	private static void useComplexe()
		{
		Complexe z = Complexe.createCartesien(123, 456);
		System.out.println(z);
		}

	private static void useGravite()
		{
		Complexe z1 = Complexe.createCartesien(50, 12.3);
		Complexe z2 = Complexe.createCartesien(4, 5);
		Complexe z3 = Complexe.createCartesien(63, 1);

		Complexe[] tabZ = { z1, z2, z3 };

		Complexe gravite = Complexe.gravite(tabZ);
		System.out.println(gravite);
		}

	private static void useSet()
		{
		Complexe z1 = Complexe.createCartesien(50, 12.3);
		Complexe z2 = Complexe.createCartesien(63, 1);
		Complexe z3 = Complexe.createCartesien(63, 1);
		Complexe z4 = z1;

		//Tree Set
			{
			Set<Complexe> setZ = new TreeSet<Complexe>();

			setZ.add(z1);
			setZ.add(z2);
			setZ.add(z3);
			setZ.add(z4);

			System.out.println(setZ);
			System.out.println(setZ.size());

			//L'unicité dans un TreeSet requiert l'implémentation de l'interface comparable
			}

		//Hash set
			{
			Set<Complexe> setZ = new HashSet<Complexe>();

			setZ.add(z1);
			setZ.add(z2);
			setZ.add(z3);
			setZ.add(z4);

			System.out.println(setZ);
			System.out.println(setZ.size());

			//L'unicité dans un HashSet requiert la redéfinition de la méthode equals et donc de la méthode hashCode
			}
		}
	}
