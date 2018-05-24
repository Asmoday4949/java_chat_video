
package ch.hearc.cours.kitbase.array;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import ch.hearc.cours.kitbase.tools.Tab1DTools;

public class TestTab1D
	{
	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	@Before
	public void before()
		{
		// rien
		}

	@After
	public void after()
		{
		// rien
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	@Test
	public void testAddTab1D()
		{
		double[] tab1 = new double[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		double[] tab2 = new double[] { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };

		double[] tabEmpirique = Tab1DTools.add(tab1, tab2);
		double[] tabTheorique = new double[] { 3, 5, 7, 9, 11, 13, 15, 17, 19, 21 };

		Assert.assertTrue(tabEmpirique.length == tabTheorique.length);
		Assert.assertTrue(tab1.length == tab2.length);
		Assert.assertTrue(tab1.length == tabTheorique.length);
		Assert.assertTrue(Tab1DTools.isEquals(tabEmpirique, tabTheorique));
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	}
