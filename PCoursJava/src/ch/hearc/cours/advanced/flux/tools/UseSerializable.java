
package ch.hearc.cours.advanced.flux.tools;

import java.io.IOException;

import org.junit.Assert;

public class UseSerializable
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
		useSimpleSerializer();
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	private static void useSimpleSerializer()
		{
		String test = new String("String de test");
		String testCopie;
		try
			{
			testCopie = (String)SerializerTools.clone(test);
			Assert.assertTrue(testCopie.equals(test));
			}
		catch (ClassNotFoundException | IOException e)
			{
			e.printStackTrace();
			}

		}


	}
