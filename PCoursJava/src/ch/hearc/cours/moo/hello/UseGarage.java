
package ch.hearc.cours.moo.hello;

import junit.framework.Assert;

public class UseGarage
	{
	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	public static void main(String[] args)
		{
		main();
		}

	public static void main()
		{
		useRoue();
		useCar();
		useGarage();
		useTestGarage();
		useGarageForeach();
		}

	private static void useGarageForeach()
		{
		Garage garage = createGarage();
		for(Car voiture:garage)
			{
			System.out.println(voiture);
			}
		}

	private static void useTestGarage()
		{
		//Test de garages
		String ancienNom = "Test de garage";
		Garage garage1 = new Garage(ancienNom);
		Car car1 = createVoiture("Chevrolet");
		garage1.add(car1);

		Roue roue1 = new Roue("Goodyear1", 50);
		Roue roue2 = new Roue("Goodyear2", 50);
		Roue roue3 = new Roue("Goodyear3", 50);
		Roue roue4 = new Roue("Goodyear4", 50);

		Roue[] tabRoues = { roue1, roue2, roue3, roue4 };

		garage1.add(new Car(tabRoues, "Voiture 2"));

		//Clone
		Garage garage2 = new Garage(garage1);
		String nouveauNom = "Garage modifié";
		garage1.setName(nouveauNom);
		car1.setName("Ferrari");
		roue1.setBrand("New Brand");

		System.out.println(garage1);
		System.out.println(garage2);

		Assert.assertTrue(garage2.getName() == ancienNom);

		}

	private static Garage createGarage()
		{
		Garage garage = new Garage("Le Garage de Ferdinand");

		Car voiture1 = createVoiture("Delorean");
		garage.add(voiture1);

		Car voiture2 = createVoiture("Chevelle Malibu");
		garage.add(voiture2);
		return garage;
		}

	private static void useGarage()
		{
		Garage garage = new Garage("Le Garage de Ferdinand");
		System.out.println(garage);

		Car voiture1 = createVoiture("Delorean");
		garage.add(voiture1);
		System.out.println(garage);

		Car voiture2 = createVoiture("Chevelle Malibu");
		garage.add(voiture2);
		System.out.println(garage);

		garage.remove(voiture1);
		garage.remove(voiture2);
		System.out.println(garage);
		}

	private static Car createVoiture(String name)
		{
		Roue[] tabRoues = createRoues();

		return new Car(tabRoues, name);
		}

	private static void useCar()
		{
		Roue[] tabRoues = createRoues();

		Car voiture = new Car(tabRoues, "Peugeot");
		System.out.println(voiture);
		}

	private static Roue[] createRoues()
		{
		Roue roue1 = new Roue("Goodyear1", 50);
		Roue roue2 = new Roue("Goodyear2", 50);
		Roue roue3 = new Roue("Goodyear3", 50);
		Roue roue4 = new Roue("Goodyear4", 50);

		Roue[] tabRoues = { roue1, roue2, roue3, roue4 };
		return tabRoues;
		}

	private static void useRoue()
		{
		Roue roue = new Roue("Goodyear", 50);
		System.out.println(roue);
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	}
