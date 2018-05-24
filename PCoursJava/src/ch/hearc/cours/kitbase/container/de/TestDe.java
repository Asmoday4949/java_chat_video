package ch.hearc.cours.kitbase.container.de;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestDe
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

	 /*-----------------------------------------------------------------*\
	 |*							Methodes Public							*|
	 \*-----------------------------------------------------------------*/

	@Test
	public void testDe1()
		{
		int tailleDe = 6;
		int nbSimulations = Integer.MAX_VALUE/1000;
		int lancerMoyenEmpirique = De.simulerDe(tailleDe, nbSimulations);
		int lancerMoyenTheorique = 15;

		Assert.assertTrue(lancerMoyenEmpirique == lancerMoyenTheorique);
		}

	@Test
	public void testDe2()
		{
		int tailleDe = 6;
		int nbSimulations = Integer.MAX_VALUE/100;
		int lancerMoyenEmpirique = De.simulerDe(tailleDe, nbSimulations);
		int lancerMoyenTheorique = 15;

		Assert.assertTrue(lancerMoyenEmpirique == lancerMoyenTheorique);
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	}
