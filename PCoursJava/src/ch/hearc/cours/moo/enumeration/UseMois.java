
package ch.hearc.cours.moo.enumeration;

import org.junit.Assert;

public class UseMois
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
		afficherMois();
		conversion();
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	private static void afficherMois()
		{
		System.out.println(Mois.JANVIER.name());
		System.out.println(Mois.FEVRIER);

		System.out.println();

		for(Mois mois:Mois.values())
			{
			System.out.println(mois);
			}

		for(Mois mois:Mois.values())
			{
			System.out.println(mois.getIndex());
			}
		}

	private static void conversion()
		{
		//Conversion Enum to String
		String janvier = Mois.JANVIER.name();

		//Conversion String to Enum
		Mois january = Mois.valueOf(janvier);

		System.out.println(janvier);
		System.out.println(january);

		for(Mois mois:Mois.values())
			{
			try
				{
				int index = mois.getIndex();
				Mois moisbis = Mois.fromIndex(index);
				Assert.assertTrue(moisbis == mois);
				}
			catch (Exception e)
				{
				e.printStackTrace();
				}
			}

		}
	}
