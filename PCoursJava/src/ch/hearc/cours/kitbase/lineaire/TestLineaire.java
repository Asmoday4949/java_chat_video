
package ch.hearc.cours.kitbase.lineaire;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestLineaire
	{
	/*-----------------------------------------------------------------*\
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
	public void testLineaire1()
		{
		int a = 12;
		int b = 24;
		double xEmpirique = Lineaire.solve(a, b);
		double xTheorique = -2;
		Assert.assertTrue(xEmpirique == xTheorique);
		}

	@Test
	public void testLineaire2()
		{
		int a = 12;
		int b = 36;
		double xEmpirique = Lineaire.solve(a, b);
		double xTheorique = -3;
		Assert.assertTrue(xEmpirique == xTheorique);
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	}
