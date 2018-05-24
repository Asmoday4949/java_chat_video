
package ch.hearc.cours.moo.quadratique;

import org.junit.Assert;

import ch.hearc.cours.kitbase.tools.MathTools;
import ch.hearc.cours.kitbase.tools.Tab1DTools;

public class Quadratique implements Runnable
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	/**
	 * Hypothèse : a != 0
	 */
	public Quadratique(double a, double b, double c)
		{
		Assert.assertFalse(MathTools.isEquals(a, 0));
		this.a = a;
		this.b = b;
		this.c = c;
		}

	/**
	 * Totalement inutile sur des classes runnable !
	 * Ici juste pour le sport.
	 */
	public Quadratique(Quadratique source)
		{
		this(source.a, source.b, source.c); //Contrainte première ligne
		//V1
			{
			//this.run();
			}
		//V2
			{
			this.discriminant = source.discriminant;
			//this.tabX = source.tabX; //Musée des horreurs, copie superficiel donnés partagées
			if (source.tabX != null)
				{
				this.tabX = Tab1DTools.clone(source.tabX);
				}
			}
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	@Override
	public void run()
		{
		this.discriminant = calcDiscriminant(a, b, c);
		if (discriminant > 0)
			{
			double x1 = (-b + Math.sqrt(discriminant)) / 2 / a;
			double x2 = (-b - Math.sqrt(discriminant)) / 2 / a;
			tabX = new double[] { x1, x2 };
			}
		else if (discriminant == 0)
			{
			tabX = new double[] { -b / 2 / a };
			}
		else
			{
			tabX = new double[0];
			}
		}

	/*------------------------------*\
	|*				Get				*|
	\*------------------------------*/

	public double getDiscriminant()
		{
		return this.discriminant;
		}

	/**
	 * Si pas de solution alors la taille du tableau est 0
	 */
	public double[] getTabX()
		{
		return this.tabX;
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	private static double calcDiscriminant(double a, double b, double c)
		{
		return b * b - 4 * a * c;
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	@Override
	public String toString()
		{
		StringBuilder builder = new StringBuilder();
		builder.append(this.a);
		builder.append("*x^2+");
		builder.append(this.b);
		builder.append("*x+");
		builder.append(this.c);
		builder.append("=0");
		if (tabX != null)
			{
			builder.append(" ->");
			for(int i = 0; i < tabX.length; i++)
				{
				builder.append("x");
				builder.append(i);
				builder.append(" = ");
				builder.append(tabX[i]);
				}
			}
		return builder.toString();
		}

	//input
	private double a;
	private double b;
	private double c;

	//tools
	private double discriminant;

	//output
	private double[] tabX;

	}
