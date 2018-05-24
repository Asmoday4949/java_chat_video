
package ch.hearc.cours.moo.hello;

import java.util.Arrays;

public class Car
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public Car(Roue[] tabRoues, String name)
		{
		this.tabRoues = tabRoues;
		this.name = name;
		}

	public Car(Car source)
		{
		this(Car.clone(source.tabRoues), source.name); // Contrainte : première ligne du constructeur
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	@Override
	public String toString()
		{
		StringBuilder builder = new StringBuilder();
		builder.append("Car [tabRoues=");
		builder.append(Arrays.toString(this.tabRoues));
		builder.append(", name=");
		builder.append(this.name);
		builder.append("]");
		return builder.toString();
		}

	public Car cloneOf()
		{
		return new Car(this);
		}

	@Override
	protected Car clone() throws CloneNotSupportedException
		{
		return this.cloneOf();
		}

	/*------------------------------*\
	|*				Set				*|
	\*------------------------------*/

	public void setName(String name)
		{
		this.name = name;
		}

	/*------------------------------*\
	|*				Get				*|
	\*------------------------------*/

	public Roue[] getTabRoues()
		{
		return this.tabRoues;
		}

	public String getName()
		{
		return this.name;
		}

	/*------------------------------*\
	|*				Is				*|
	\*------------------------------*/

	public boolean isEquals(Car car2)
		{
		if (this == car2)
			{
			return true;
			}
		else if (!this.name.equals(car2.name))
			{
			return false;
			}
		else
			{
			if (this.tabRoues.length != car2.tabRoues.length)
				{
				return false;
				}
			else
				{
				int i = 0;
				for(Roue roue:car2.tabRoues)
					{
					if (!roue.isEquals(this.tabRoues[i])) { return false; }
					i++;
					}
				return true;
				}
			}
		}

	@Override
	public boolean equals(Object obj)
		{
		if (obj instanceof Car)
			{
			return this.isEquals((Car)obj);
			}
		else
			{
			return false;
			}
		}

	@Override
	public int hashCode()
		{
		return this.name.hashCode(); // on pourrait améliorer en additionnant tous les hashcodes des roues
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	private static Roue[] clone(Roue[] tabRouesSource)
		{
		int n = tabRouesSource.length;
		Roue[] tabRouesClone = new Roue[n];
		for(int i = 0; i < n; i++)
			{
			tabRouesClone[i] = new Roue(tabRouesSource[i]); //Appel du constructeur de copie de la classe Roue
			}
		return tabRouesClone;
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	//input
	private Roue[] tabRoues;
	private String name;

	}
