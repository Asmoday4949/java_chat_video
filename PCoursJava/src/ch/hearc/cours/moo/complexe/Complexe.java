
package ch.hearc.cours.moo.complexe;

import java.text.DecimalFormat;

import ch.hearc.cours.kitbase.tools.MathTools;

public class Complexe implements Comparable<Complexe>
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	/**
	 * Constructeur cartésien privé
	 */
	private Complexe(double re, double im)
		{
		this.re = re;
		this.im = im;
		updatePolaire();
		}

	public Complexe(Complexe source)
		{
		this(source.re, source.im);
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	@Override
	public String toString()
		{
		DecimalFormat arrondisseur = new DecimalFormat("#.###");

		StringBuilder builder = new StringBuilder();
		builder.append(CARTESIEN);
		builder.append(arrondisseur.format(this.re));
		builder.append(VIRGULE);
		builder.append(arrondisseur.format(this.im));
		builder.append(POLAIRE);
		builder.append(arrondisseur.format(this.mod));
		builder.append(VIRGULE);
		builder.append(arrondisseur.format(this.arg));
		builder.append(LAST_PARENTHESE + "\n");
		return builder.toString();
		}

	public Complexe cloneOf()
		{
		return new Complexe(this);
		}

	@Override
	protected Complexe clone() throws CloneNotSupportedException
		{
		return this.cloneOf();
		}

	public Complexe add(Complexe z2)
		{
		//V1 Catastrophe !
		//			{
		//			Complexe z = new Complexe(0, 0);
		//			z.re = this.re + z2.re;
		//			z.im = this.im + z2.im;
		//			z.updatePolaire();
		//			return z;
		//			}
		//V2
			{
			return new Complexe(re + z2.re, this.im + z2.im);
			}
		}

	public Complexe soustract(Complexe z2)
		{
		return this.add(z2.mult(-1));
		}

	public Complexe mult(double scalaire)
		{
		return new Complexe(this.re * scalaire, this.im * scalaire);
		}

	public Complexe mult(Complexe z2)
		{
		return createPolaire(this.mod * z2.mod, this.arg + z2.arg);
		}

	public Complexe pow(int power)
		{
		return createPolaire(Math.pow(this.mod, power), this.arg * power);
		}

	public Complexe div(Complexe z2)
		{
		return createPolaire(this.mod / z2.mod, this.arg - z2.arg);
		}

	public Complexe div(double scalaire)
		{
		return this.mult(1 / scalaire);
		}

	@Override
	public int compareTo(Complexe z2)
		{
		if (this.equals(z2))
			{
			return 0;
			}
		else if (this.mod > z2.mod)
			{
			return 1;
			}
		else
			{
			return -1;
			}
		}

	/*------------------------------*\
	|*				Is				*|
	\*------------------------------*/

	public boolean isEquals(Complexe z2)
		{
		return this.isEquals(z2, 1e-6);
		}

	public boolean isEquals(Complexe z2, double epsilon)
		{
		if (this == z2)
			{
			return true;
			}
		else
			{
			return MathTools.isEquals(this.re, z2.re, epsilon) && MathTools.isEquals(this.im, z2.im, epsilon);
			}
		}

	@Override
	public boolean equals(Object obj)
		{
		if (obj instanceof Complexe)
			{
			return this.isEquals((Complexe)obj);
			}
		else
			{
			return false;
			}
		}

	@Override
	public int hashCode()
		{
		//contrainte 1: chaque fois qu'on redéfinit equals, il faut redéfinir hashCode()
		//contrainte 2: deux nombres complexes égaux doivent avoir le même hashCode, mais la réciproque n'a pas nécaisserement besoin d'être vrai
		return 1; // contrainte 2 respectée. pas génial ! mais difficile à faire car on doit tenir compte d'une égalité à epsilon près
		}

	/*------------------------------*\
	|*				Set				*|
	\*------------------------------*/

	/*------------------------------*\
	|*				Get				*|
	\*------------------------------*/

	public double getRe()
		{
		return this.re;
		}

	public double getIm()
		{
		return this.im;
		}

	public double getMod()
		{
		return this.mod;
		}

	public double getArg()
		{
		return this.arg;
		}

	/*------------------------------*\
	|*			  Static			*|
	\*------------------------------*/

	/**
	 * Polaire
	 */
	public static Complexe createPolaire(double mod, double arg)
		{
		return new Complexe(re(mod, arg), im(mod, arg));
		}

	/**
	 * Cartesien
	 */
	public static Complexe createCartesien(double re, double im)
		{
		return new Complexe(re, im);
		}

	public static Complexe gravite(Complexe[] tabZ)
		{
		Complexe result = createCartesien(0, 0);

		for(Complexe z:tabZ)
			{
			result = result.add(z);
			}

		return result.div(tabZ.length);
		}

	public static Complexe[] createCircle(int n, double rayon, Complexe zc)
		{
		double alphai = 0;
		double dAlpha = 2 * Math.PI / n;
		Complexe[] tabz = new Complexe[n];
		for(int i = 0; i < n; i++)
			{
			Complexe z = Complexe.createPolaire(rayon, alphai);
			tabz[i] = zc.add(z);

			alphai += dAlpha;
			}
		return tabz;
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	private void updatePolaire()
		{
		this.mod = mod(re, im);
		this.arg = arg(re, im);
		}

	/*------------------------------*\
	|*			  Static			*|
	\*------------------------------*/

	private static double re(double mod, double arg)
		{
		return mod * Math.cos(arg);
		}

	private static double im(double mod, double arg)
		{
		return mod * Math.sin(arg);
		}

	private static double mod(double re, double im)
		{
		return Math.sqrt(re * re + im * im);
		}

	private static double arg(double re, double im)
		{
		return Math.atan2(im, re);
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	//Input : Représentation 1 : Cartesienne
	private double re;
	private double im;
	//Tools : Représentation 2 : Polaire
	private double mod;
	private double arg;

	/*------------------------------*\
	|*			  Static			*|
	\*------------------------------*/

	private static final String CARTESIEN = "(re,im) = (";
	private static final String POLAIRE = ")\n(mod,arg) = (";
	private static final String VIRGULE = ",";
	private static final String LAST_PARENTHESE = ")";

	}
