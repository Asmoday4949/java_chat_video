
package ch.hearc.cours.videochat.network;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Message implements Serializable
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public Message(String message)
		{
		this.message = message;
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	/*------------------------------*\
	|*				Get				*|
	\*------------------------------*/

	public String getString()
		{
		return this.message;
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	/*------------------------------*\
	|*		Serialisation			*|
	\*------------------------------*/

	private void writeObject(ObjectOutputStream out) throws IOException
		{
		System.out.println("[Message]:writeObject : Serialization custom");
		out.writeObject(crypt(message));
		}

	private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException
		{
		System.out.println("[Message]:readObject : Deserialization custom");
		message = decrypt((String)in.readObject());
		}

	private static String crypt(String data)
		{
		//TODO faire un algorithme de cryptage plus subtile
		return data+"x";
		}

	private static String decrypt(String data)
		{
		//TODO faire un algorithme de cryptage plus subtile
		return data.substring(0, data.length()-1);
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	//Input
	private String message;

	}
