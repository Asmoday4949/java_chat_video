
package ch.hearc.cours.advanced.flux;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UseFileBin
	{
	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	public static void main(String[] args)
		{
		try
			{
			main();
			}
		catch (IOException e)
			{
			e.printStackTrace();
			}
		}

	public static void main() throws IOException
		{
		double[] tab = { 1, 2, 3 };
		String filename = "file.bin";

		save(tab, filename);
		Double[] tabLoaded = load(filename);

		System.out.println(Arrays.toString(tabLoaded));

		File file = new File(filename);
		boolean isOk = file.delete();
		System.out.println("Suppresssion : " + isOk);
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	private static Double[] load(String filename) throws IOException
		{
		FileInputStream fis = new FileInputStream(filename);
		BufferedInputStream bis = new BufferedInputStream(fis);
		DataInputStream dis = new DataInputStream(bis);

		List<Double> listDouble = new ArrayList<Double>();

		try
			{
			while(true)
				{
				double element = dis.readDouble();
				listDouble.add(element);
				}
			}
		catch (IOException e)
			{
			//Fin du fichier
			}

		dis.close();
		bis.close();
		fis.close();

		return listDouble.toArray(new Double[0]); //le tableau a zéro éléments est un exemple du tableau a créer
		}

	private static void save(double[] tab, String filename) throws IOException
		{
		FileOutputStream fos = new FileOutputStream(filename);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		DataOutputStream dos = new DataOutputStream(bos);

		for(double element:tab)
			{
			dos.writeDouble(element);
			}

		dos.close();
		bos.close();
		fos.close();
		}

	}
