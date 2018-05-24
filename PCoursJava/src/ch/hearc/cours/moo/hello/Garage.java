
package ch.hearc.cours.moo.hello;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Garage implements Iterable<Car>
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public Garage(String name)
		{
		//input
			{
			this.name = name;
			}

		//tools
			{
			this.listCars = new LinkedList<Car>();
			}
		}

	public Garage(Garage source)
		{
		this(source.name); // Copie superficielle car String immutable

		//LisCar déjà initialisé dans le constructeur de base
		for(Car car:listCars)
			{
			//this.listCars.add(new Car(car));
			this.add(new Car(car));
			}
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	@Override
	public Iterator<Car> iterator()
		{
		return listCars.iterator();
		}

	public void add(Car car)
		{
		this.listCars.add(car);
		}

	public void remove(Car car)
		{
		listCars.remove(car);
		}

	@Override
	public String toString()
		{
		StringBuilder s = new StringBuilder(this.name);
		for(Car car:listCars)
			{
			s.append(car);
			s.append(Garage.RETOUR_CHARIOT);
			}
		return s.toString();
		}

	public Garage cloneOf()
		{
		return new Garage(this);
		}

	@Override
	protected Garage clone() throws CloneNotSupportedException
		{
		return this.cloneOf();
		}

	/*------------------------------*\
	|*				Is				*|
	\*------------------------------*/

	public boolean isEquals(Garage garage2)
		{
		if (this == garage2)
			{
			return true;
			}
		else if (!this.name.equals(garage2.name))
			{
			return false;
			}
		else if (this.listCars.size() != garage2.listCars.size())
			{
			return false;
			}
		else
			{
			Iterator<Car> it1 = this.listCars.iterator();
			for(Car car2:garage2)
				{
				Car car1 = it1.next();
				if (!car1.isEquals(car2)) { return false; }
				}
			return true;
			}
		}

	@Override
	public boolean equals(Object obj)
		{
		if (obj instanceof Garage)
			{
			return this.isEquals((Garage)obj);
			}
		else
			{
			return false;
			}
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

	public String getName()
		{
		return this.name;
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	//input
	private String name;

	//tools
	private List<Car> listCars;

	/*------------------------------*\
	|*			  Static			*|
	\*------------------------------*/

	private static final String RETOUR_CHARIOT = "\n";
	}
