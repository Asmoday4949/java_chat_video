
package ch.hearc.cours.kitbase.container.de;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class De
	{
	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	public static int simulerDe(int tailleDe, int nbSimulations)
		{
		int nbLancees = 0;

		for(int i = 0; i < nbSimulations; i++)
			{
			nbLancees += experienceAleatoire(tailleDe);
			}

		return (int)Math.ceil(nbLancees / (double)nbSimulations);
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	private static int experienceAleatoire(int tailleDe)
		{
		Random r = new Random(); // in [0,...]

		Set<Integer> setFacesObtenues = new HashSet<Integer>(tailleDe);

		int nbEssais = 0;
		do
			{
			int value = r.nextInt(tailleDe) + 1; // +1 car r in [0,..]
			setFacesObtenues.add(value);
			nbEssais++;
			} while(setFacesObtenues.size() < tailleDe);

		return nbEssais;
		}

	}
