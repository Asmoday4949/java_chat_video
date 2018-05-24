
package ch.hearc.cours.moo.tri;

import java.util.Comparator;

public class HumainComparatorCroissant implements Comparator<Humain>
	{

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

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
	}
