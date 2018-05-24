
package ch.hearc.cours.moo.tri;

public class Humain implements Comparable<Humain>
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public Humain(String nom, int age)
		{
		this.nom = nom;
		this.age = age;
		}

	public Humain(Humain source)
		{
		this(source.nom, source.age);
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	@Override
	public int compareTo(Humain humain2)
		{
		if (!this.getNom().equals(humain2.getNom()))
			{
			return this.getNom().compareTo(humain2.getNom());
			}
		else
			{
			return Integer.compare(this.getAge(), humain2.getAge());
			}
		}

	public Humain cloneOf()
		{
		return new Humain(this);
		}

	@Override
	protected Humain clone() throws CloneNotSupportedException
		{
		return this.cloneOf();
		}

	@Override
	public boolean equals(Object obj)
		{
		if (obj instanceof Humain)
			{
			Humain humain = (Humain)obj;
			return this.isEquals(humain);
			}
		else
			{
			return false;
			}
		}

	public boolean isEquals(Humain h2)
		{
		if (this == h2)
			{
			return true;
			}
		else
			{
			return this.nom.equals(h2.nom) && (this.age == h2.age);
			}
		}

	@Override
	public int hashCode()
		{
		return this.age + this.nom.hashCode();
		}

	@Override
	public String toString()
		{
		StringBuilder builder = new StringBuilder();
		builder.append("Humain [nom=");
		builder.append(this.nom);
		builder.append(", age=");
		builder.append(this.age);
		builder.append("]");
		return builder.toString();
		}

	/*------------------------------*\
	|*				Set				*|
	\*------------------------------*/

	public void setNom(String nom)
		{
		this.nom = nom;
		}

	public void setAge(int age)
		{
		this.age = age;
		}

	/*------------------------------*\
	|*				Get				*|
	\*------------------------------*/

	public String getNom()
		{
		return this.nom;
		}

	public int getAge()
		{
		return this.age;
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	//Inputs
	private String nom;
	private int age;
	}
