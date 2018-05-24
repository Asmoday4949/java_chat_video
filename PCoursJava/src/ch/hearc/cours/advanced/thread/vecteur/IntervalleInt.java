
package ch.hearc.cours.advanced.thread.vecteur;

import java.util.Iterator;

public class IntervalleInt extends Intervalle<Integer> implements Iterable<Integer>
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public IntervalleInt(int iStart, int iStop)
		{
		super(iStart, iStop);
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	@Override
	public Iterator<Integer> iterator()
		{
		return new Iterator<Integer>()
			{

			@Override
			public boolean hasNext()
				{
				return i < getiStop();
				}

			@Override
			public Integer next()
				{
				i++;
				return i - 1;
				}

			//Attrributs
			//Tools
			private int i = getiStart();

			};
		}

	/*------------------------------*\
	|*				Set				*|
	\*------------------------------*/

	/*------------------------------*\
	|*				Get				*|
	\*------------------------------*/

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/
	}
