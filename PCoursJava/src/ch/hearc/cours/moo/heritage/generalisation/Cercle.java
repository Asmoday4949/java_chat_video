
package ch.hearc.cours.moo.heritage.generalisation;

public class Cercle extends Forme_A
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public Cercle(String nom, double rayon)
		{
		super(nom);
		this.rayon = rayon;
		}

	public Cercle(Cercle source)
		{
		super(source); //Appel le constructeur de copie de la source
		this.rayon = source.rayon;
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	@Override
	public Cercle cloneOf()
		{
		return new Cercle(this);
		}

	@Override
	public double aire()
		{
		return Math.PI * rayon * rayon;
		}

	@Override
	public double perimetre()
		{
		return 2 * Math.PI * rayon;
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

	//Input
	private double rayon;

	}
