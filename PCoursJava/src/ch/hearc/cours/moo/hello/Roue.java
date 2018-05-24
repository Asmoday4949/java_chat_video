
package ch.hearc.cours.moo.hello;

public class Roue
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	/**
	 * Constructeur dominant/principal
	 */
	public Roue(String brand, int taille)
		{
		this.brand = brand;
		size = taille;
		}

	/**
	 * C++ : public Roue(const Roue& source){}
	 */
	public Roue(Roue source)
		{
		this(source.brand, source.size); // On peut se permettre le luxe de faire
		//	une copie superficielle de brand car la classe string est inalterable

		//Code trop lourd et pas indispensable (voir commentaire ci-dessus)
		//this(new String(source.brand), source.size); Copie profonde de brand inutile
		//	car string est inalterable !
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	@Override
	public String toString()
		{
		StringBuilder builder = new StringBuilder();
		builder.append(Roue.BRAND);
		builder.append(this.brand);
		builder.append(Roue.SIZE);
		builder.append(this.size);
		builder.append(Roue.END_TOSTRING);

		return builder.toString();
		}

	public Roue cloneOf()
		{
		return new Roue(this);
		}

	@Override
	protected Roue clone() throws CloneNotSupportedException
		{
		return this.cloneOf();
		}

	/*------------------------------*\
	|*				Set				*|
	\*------------------------------*/

	public String getBrand()
		{
		return this.brand;
		}

	/*------------------------------*\
	|*				Get				*|
	\*------------------------------*/

	public void setBrand(String brand)
		{
		this.brand = brand;
		}

	public int getSize()
		{
		return this.size;
		}

	/*------------------------------*\
	|*				Is				*|
	\*------------------------------*/

	public boolean isEquals(Roue roue2)
		{
		if (this == roue2)
			{
			return true;
			}
		else
			{
			return this.brand.equals(roue2.brand) && this.size == roue2.size;
			}
		}

	@Override
	public boolean equals(Object obj)
		{
		if (obj instanceof Roue)
			{
			return this.isEquals((Roue)obj);
			}
		else
			{
			return false;
			}
		}

	@Override
	public int hashCode()
		{
		return this.size + this.brand.hashCode();
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	//input
	private String brand;
	private int size;

	/*------------------------------*\
	|*			  Static			*|
	\*------------------------------*/

	private static final String BRAND = "Roue [brand=";
	private static final String SIZE = ", size=";
	private static final String END_TOSTRING = "]";
	}
