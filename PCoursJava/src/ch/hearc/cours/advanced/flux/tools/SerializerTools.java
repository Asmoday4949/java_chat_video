
package ch.hearc.cours.advanced.flux.tools;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializerTools
	{

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	public static byte[] serialize(Serializable serializable) throws IOException
		{
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		BufferedOutputStream bos = new BufferedOutputStream(baos);
		ObjectOutputStream oos = new ObjectOutputStream(bos);

		oos.writeObject(serializable);

		oos.close();
		bos.close();
		baos.close();

		return baos.toByteArray();
		}

	public static Serializable unserialize(byte[] data) throws IOException, ClassNotFoundException
		{
		ByteArrayInputStream bais = new ByteArrayInputStream(data);
		BufferedInputStream bis = new BufferedInputStream(bais);
		ObjectInputStream ois = new ObjectInputStream(bis);

		Serializable serializable = (Serializable)ois.readObject();

		ois.close();
		bis.close();
		bais.close();

		return serializable;
		}

	public static Serializable clone(Serializable serializable) throws ClassNotFoundException, IOException
		{
		return unserialize(serialize(serializable));
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	}
