
package ch.hearc.cours.moo.heritage.specialisation.hello;

import ch.hearc.coursjava.moo.heritage.simple.HmTimes;

public class HmsTimes extends HmTimes
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public HmsTimes(int heure, int minute, int seconde)
		{
		super(heure, minute);
		this.seconde = seconde;
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	@Override
	public String toString()
		{
		return super.toString() + seconde + "s";
		}

	/*------------------------------*\
	|*				Set				*|
	\*------------------------------*/

	public void set(int heure, int minute, int seconde)
		{

		//V1 : Musee des horreurs : car si on redefini la methode set(int, int) dans la classe courante, le nouveau set ne sera pas pris en compte
		//							on emploi uniquement le super, pour eviter la recursivite voir toString()
		//			{
		//			super.set(heure, minute);
		//			}

		//V2
			{
			set(heure, minute);
			}
		//V3
		//			{
		//			this.set(heure, minute);
		//			}

		this.seconde = seconde;
		}

	/*------------------------------*\
	|*				Get				*|
	\*------------------------------*/

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	//input
	private int seconde;

	}
