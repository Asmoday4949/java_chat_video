
package ch.hearc.cours.moo.generique;

import java.util.LinkedList;
import java.util.List;

public class StackLinked<T> implements Stack_I<T>
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public StackLinked()
		{
		this.list = new LinkedList<T>();
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
