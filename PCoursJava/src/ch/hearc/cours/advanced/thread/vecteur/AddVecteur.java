
package ch.hearc.cours.advanced.thread.vecteur;

import org.junit.Assert;

/**
 * @author thomas.frantzen
 */
public class AddVecteur implements Runnable
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	/**
	 * v1 et v2 doivent être de même taille
	 */
	public AddVecteur(double[] v1, double[] v2)
		{
		Assert.assertTrue(v1.length == v2.length);

		this.v1 = v1;
		this.v2 = v2;

		vResult = new double[v1.length];
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	@Override
	public void run()
		{
		int milieu = v1.length / 2;

		IntervalleInt intervalle1 = new IntervalleInt(0, milieu);
		IntervalleInt intervalle2 = new IntervalleInt(milieu, v1.length);

		Runnable runnable1 = runnable(intervalle1);
		Runnable runnable2 = runnable(intervalle2);

		//Version séquentielle
		//			{
		//			runnable1.run();
		//			runnable2.run();
		//			}

		//Version parallèle
			{
			Thread thread1 = new Thread(runnable1);
			Thread thread2 = new Thread(runnable2);

			thread1.start(); //Assynchrone
			thread2.start(); //Assynchrone

			try
				{
				thread1.join(); //Synchrone, bloque le thread courant
				thread2.join(); //Synchrone, bloque le thread courant
				}
			catch (InterruptedException e)
				{
				e.printStackTrace();
				}
			}
		}

	/*------------------------------*\
	|*				Get				*|
	\*------------------------------*/

	public double[] getvResult()
		{
		return this.vResult;
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	private Runnable runnable(IntervalleInt intervalle)
		{
		return new Runnable()
			{

			@Override
			public void run()
				{
				for(int i:intervalle)
					{
					vResult[i] = v2[i] + v1[i];
					}
				}
			};
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	//Input
	private double[] v1;
	private double[] v2;

	//Output
	private double[] vResult;

	//Tools

	}
