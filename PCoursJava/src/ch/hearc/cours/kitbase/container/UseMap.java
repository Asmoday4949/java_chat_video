
package ch.hearc.cours.kitbase.container;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class UseMap
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
		int n = 5;
		//Map<String, Integer> map = new TreeMap<String, Integer>();
		Map<String, Integer> map = new HashMap<String, Integer>(n); //n facultatif optimisation
		peupler(map, n);
		print(map);
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	private static void peupler(Map<String, Integer> map, int n)
		{
		for(int i = 1; i <= n; i++)
			{
			map.put("Personne" + i, i);
			}
		}

	private static void print(Map<String, Integer> map)
		{
		//V1 : Afficher les valeurs
			{
			Collection<Integer> collection = map.values();
			for(Integer valeur:collection)
				{
				System.out.println(valeur);
				}
			}

		//V2 : Afficher que les clefs
			{
			Set<String> set = map.keySet();
			for(String clef:set)
				{
				System.out.println(clef);
				}
			}

		//V3 : Affiche les lignes
			{
			Set<Entry<String, Integer>> set = map.entrySet();
			for(Entry<String, Integer> entry:set)
				{
				//V3.1
				//					{
				//					String clef = entry.getKey();
				//					Integer valeur = entry.getValue();
				//					System.out.println(clef + " = " + valeur);
				//					}

				//V3.2
					{
					System.out.println(entry);
					}
				}
			}
		}
	}
