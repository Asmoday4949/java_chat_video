
package ch.hearc.cours.moo.lineaire;

import org.junit.Assert;
import org.junit.Test;

import ch.hearc.cours.kitbase.tools.MathTools;

public class TestLineaire
	{
	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	@Test
	public void test1()
		{
		double a = 12;
		double b = -48;
		Lineaire lineaire = new Lineaire(a, b);
		lineaire.run();

		double xEmpirique = lineaire.getX();
		double xTheorique = 4;

		Assert.assertTrue(MathTools.isEquals(xEmpirique, xTheorique));
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	}
