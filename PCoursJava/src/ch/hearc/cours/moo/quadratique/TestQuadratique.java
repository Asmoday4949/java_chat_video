package ch.hearc.cours.moo.quadratique;

import org.junit.Assert;
import org.junit.Test;

import ch.hearc.cours.kitbase.tools.Tab1DTools;

public class TestQuadratique
	{
	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	@Test
	public void testQuadratique1()
		{
		double a = 1;
		double b = 5;
		double c = 6;
		Quadratique quadratique = new Quadratique(a, b, c);
		quadratique.run();
		double[] tabXTheorique = new double[] { -2, -3 };
		double[] tabXEmpirique = quadratique.getTabX();

		Assert.assertTrue(tabXEmpirique.length == 2);
		Assert.assertTrue(tabXTheorique.length == 2);
		Assert.assertTrue(Tab1DTools.isEqualsOrdered(tabXEmpirique, tabXTheorique));
		}

	@Test
	public void testQuadratique2()
		{
		double a = 1;
		double b = -4;
		double c = 4;
		Quadratique quadratique = new Quadratique(a, b, c);
		quadratique.run();
		double[] tabXTheorique = new double[] {2};
		double[] tabXEmpirique = quadratique.getTabX();

		Assert.assertTrue(tabXEmpirique.length == 1);
		Assert.assertTrue(tabXEmpirique[0] == tabXTheorique[0]);
		}

	@Test
	public void testQuadratique3()
		{
		double a = 35;
		double b = 1;
		double c = 4;
		Quadratique quadratique = new Quadratique(a, b, c);
		quadratique.run();
		double[] tabXEmpirique = quadratique.getTabX();

		Assert.assertTrue(tabXEmpirique.length == 0);
		}
	}
