
package ch.hearc.cours.advanced.flux;

import java.io.IOException;

import org.junit.Assert;

import ch.hearc.cours.advanced.flux.tools.SerializerTools;

public class UseSerialization
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
		useSimple();
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	private static void useSimple()
		{
		try
			{
			String test = new String("String de test");
			String testCopie;

			testCopie = (String)SerializerTools.clone(test);
			Assert.assertTrue(testCopie.equals(test));

			System.out.println(testCopie);
			}
		catch (ClassNotFoundException | IOException e)
			{
			e.printStackTrace();
			}
		}

	private static void useComplexe()
		{
		//TODO
		}
	}
