
package ch.hearc.cours.moo.lineaire;

import org.junit.Assert;

public class Lineaire implements Runnable
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	/**
	 * Hypothèse : a != 0
	 */
	public Lineaire(double a, double b)
		{
		Assert.assertTrue(a != 0);
		this.a = a;
		this.b = b;
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	@Override
	public void run()
		{
		x = -b / a;
		}

	/*------------------------------*\
	|*				Get				*|
	\*------------------------------*/

	public double getX()
		{
		return this.x;
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	//input
	private double a;
	private double b;

	//output
	private double x;

	}
