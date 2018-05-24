
package ch.hearc.cours.advanced.thread.vecteur;

public class Intervalle<T>
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public Intervalle(T iStart, T iStop)
		{
		this.iStart = iStart;
		this.iStop = iStop;
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	@Override
	public String toString()
		{
		StringBuilder builder = new StringBuilder();
		builder.append("Intervalle [iStart=");
		builder.append(this.iStart);
		builder.append(", iStop=");
		builder.append(this.iStop);
		builder.append("]");
		return builder.toString();
		}

	/*------------------------------*\
	|*				Get				*|
	\*------------------------------*/

	public T getiStart()
		{
		return this.iStart;
		}

	public T getiStop()
		{
		return this.iStop;
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	//Input
	private T iStart;
	private T iStop;

	}
