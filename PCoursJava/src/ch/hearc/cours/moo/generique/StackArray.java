
package ch.hearc.cours.moo.generique;

import java.util.ArrayList;
import java.util.List;

public class StackArray<T> implements Stack_I<T>
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public StackArray(int capacity)
		{
		this.list = new ArrayList<T>(capacity);
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	@Override
	public T pop()
		{
		return list.remove(list.size() - 1);
		}

	@Override
	public void push(T x)
		{
		list.add(x);
		}

	@Override
	public String toString()
		{
		StringBuilder str = new StringBuilder();
		for(T x:list)
			{
			str.append(x);
			str.append(RETOUR);
			}
		return str.toString();
		}

	@Override
	public int size()
		{
		return list.size();
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	//Tools
	private List<T> list;

	/*------------------------------*\
	|*			  Static			*|
	\*------------------------------*/

	private static final String RETOUR = "\n";

	}
