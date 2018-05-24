
package ch.hearc.cours.kitbase.quadratique;

import java.util.Map;
import java.util.TreeMap;

import org.junit.Assert;

public class UseQuadratiqueArgs
	{
	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	/**
	 * Exemple: c=2 a=9 b=4 (ordre sans importance)
	 */
	public static void main(String[] args)
		{
		Assert.assertTrue(args.length == 3);

		Map<String, Double> mapABCValeurs = parsing(args);

		//System.out.println(mapABCValeurs);

		double a = mapABCValeurs.get("a");
		double b = mapABCValeurs.get("b");
		double c = mapABCValeurs.get("c");

		double[] tabResultats = Quadratique.solve(a, b, c);
		Quadratique.print(a, b, c, tabResultats);
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	private static Map<String, Double> parsing(String[] args)
		{
		Map<String, Double> mapABCValeurs = new TreeMap<String, Double>(); //Ordonne selon la cle

		for(String bloc:args)
			{
			peuplerMap(bloc, mapABCValeurs);
			}

		Assert.assertTrue(mapABCValeurs.size() == 3);
		Assert.assertTrue(mapABCValeurs.containsKey("a"));
		Assert.assertTrue(mapABCValeurs.containsKey("b"));
		Assert.assertTrue(mapABCValeurs.containsKey("c"));

		return mapABCValeurs;
		}

	private static void peuplerMap(String bloc, Map<String, Double> mapABCValeurs)
		{
		try
			{
			String[] tab = bloc.split("=");
			double value = Double.valueOf(tab[1]);

			mapABCValeurs.put(tab[0], value);
			}
		catch (NumberFormatException e)
			{
			System.err.println("Mode d'emploi");
			System.exit(-1); // 0 normal, -1 anormal
			}
		}

	}
