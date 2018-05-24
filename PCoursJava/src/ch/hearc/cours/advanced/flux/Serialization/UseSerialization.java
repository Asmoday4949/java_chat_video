
package ch.hearc.cours.advanced.flux.Serialization;

import java.io.File;
import java.io.IOException;

import ch.hearc.cours.advanced.flux.tools.SerializerFileTools;
import ch.hearc.cours.advanced.flux.tools.SerializerTools;

public class UseSerialization
	{
	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	public static void main(String[] args) throws IOException, ClassNotFoundException
		{
		main();
		}

	public static void main() throws IOException, ClassNotFoundException
		{
		serializationMemory();
		serializationFile();
		}

	private static void serializationMemory() throws IOException, ClassNotFoundException
		{
		Equipe equipe = createEquipe();
		byte[] tabBytes = SerializerTools.serialize(equipe);
		Equipe equipeClone = (Equipe)SerializerTools.unserialize(tabBytes);

		System.out.println(equipe);
		System.out.println(equipeClone);
		}

	private static void serializationFile() throws IOException, ClassNotFoundException
		{
		Equipe equipe = createEquipe();
		String filename = "team-file.bin";

		SerializerFileTools.serialize(filename, equipe);
		Equipe equipeClone = (Equipe)SerializerFileTools.unserialize(filename);

		System.out.println(equipe);
		System.out.println(equipeClone);

		File file = new File(filename);
		file.delete();
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	private static Equipe createEquipe()
		{
		Equipe equipe = new Equipe("Equipe "+numberEquipe);
		String[] tabName = { "Toto", "Titi", "Tata" };
		int compteur = 100;
		for(String name:tabName)
			{
			equipe.add(new Player(name, compteur));
			compteur += 100;
			}
		numberEquipe+=1;
		return equipe;
		}


	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	// Tools
	private static int numberEquipe = 1;

	}
