
package ch.hearc.cours.moo.heritage.generalisation;

public class Rectangle extends Quadrilatere
	{
	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public Rectangle(String nom, double c1, double c2)
		{
		super(nom);
		this.c1 = c1;
		this.c2 = c2;
		}

	public Rectangle(Rectangle source)
		{
		super(source);
		this.c1 = source.c1;
		this.c2 = source.c2;
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	@Override
	public Rectangle cloneOf()
		{
		return new Rectangle(this);
		}

	@Override
	public double aire()
		{
		return c1 * c2;
		}

	@Override
	public double perimetre()
		{
		return 2 * c1 + 2 * c2;
		}

	@Override
	public String toString()
		{
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(super.toString());
		stringBuilder.append(COTE1);
		stringBuilder.append(c1);
		stringBuilder.append(COTE2);
		stringBuilder.append(c2);
		return stringBuilder.toString();
		}

	/*------------------------------*\
	|*				Get				*|
	\*------------------------------*/

	public double getC1()
		{
		return this.c1;
		}

	public double getC2()
		{
		return this.c2;
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	//Input
	private double c1;
	private double c2;

	/*------------------------------*\
	|*			  Static			*|
	\*------------------------------*/

	private static final String COTE1 = " cote1:";
	private static final String COTE2 = " cote2:";
	}
