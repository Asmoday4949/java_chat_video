
package ch.hearc.cours.moo.complexe;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestComplexe
	{

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*-----------------------------------------------------------------*/

	@Test
	public void testAdd()
		{
		Complexe z1 = Complexe.createCartesien(20, 15);
		Complexe z2 = Complexe.createCartesien(23, 10.5);
		Complexe zEmpirique = z1.add(z2);
		Complexe zTheorique = Complexe.createCartesien(43, 25.5);

		assertTrue(zEmpirique.isEquals(zTheorique));
		}

	@Test
	public void testSoustract()
		{
		Complexe z1 = Complexe.createCartesien(20, 15);
		Complexe z2 = Complexe.createCartesien(23, 10.5);
		Complexe zEmpirique = z1.soustract(z2);
		Complexe zTheorique = Complexe.createCartesien(-3, 4.5);

		assertTrue(zEmpirique.isEquals(zTheorique));
		}

	@Test
	public void testMultScalaire()
		{
		Complexe z1 = Complexe.createCartesien(5, 3);
		double scalaire = 5;
		Complexe zEmpirique = z1.mult(scalaire);

		Complexe zTheorique = Complexe.createCartesien(25, 15);

		assertTrue(zEmpirique.isEquals(zTheorique));
		}

	@Test
	public void testMult()
		{
		Complexe z1 = Complexe.createPolaire(3, Math.PI / 3);
		Complexe z2 = Complexe.createPolaire(4, Math.PI / 4);

		Complexe zEmpirique = z1.mult(z2);
		Complexe zTheorique = Complexe.createPolaire(12, 7 * Math.PI / 12);

		assertTrue(zEmpirique.isEquals(zTheorique));
		}

	@Test
	public void testPow()
		{
		Complexe z1 = Complexe.createPolaire(3, Math.PI / 3);
		int power = 2;

		Complexe zEmpirique = z1.pow(power);
		Complexe zTheorique = Complexe.createPolaire(9, 2 * Math.PI / 3);

		assertTrue(zEmpirique.isEquals(zTheorique));
		}

	@Test
	public void testDiv()
		{
		Complexe z1 = Complexe.createPolaire(3, Math.PI / 3);
		Complexe z2 = Complexe.createPolaire(4, Math.PI / 4);

		Complexe zEmpirique = z1.div(z2);

		Complexe zTheorique = Complexe.createPolaire(0.75, Math.PI / 3 - Math.PI / 4);

		assertTrue(zEmpirique.isEquals(zTheorique));
		}

	@Test
	public void testGravite()
		{
		Complexe zc1Theorique = Complexe.createCartesien(0, 0);
		Complexe zc2Theorique = Complexe.createCartesien(1, 2);
		Complexe zc3Theorique = Complexe.createCartesien(3.1, 4.6);

		Complexe zc1Empirique = Complexe.gravite(Complexe.createCircle(10, 5, zc1Theorique));
		Complexe zc2Empirique = Complexe.gravite(Complexe.createCircle(5, 1, zc2Theorique));
		Complexe zc3Empirique = Complexe.gravite(Complexe.createCircle(8, 5.3, zc3Theorique));

		assertTrue(zc1Empirique.isEquals(zc1Theorique));
		assertTrue(zc2Empirique.isEquals(zc2Theorique));
		assertTrue(zc3Empirique.isEquals(zc3Theorique));
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	}
