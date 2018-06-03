
package ch.hearc.cours.videochat.network;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.security.InvalidKeyException;

import ch.hearc.cours.videochat.crypt.CryptingFactory;
import ch.hearc.cours.videochat.crypt.Crypting_I;

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
		Crypting_I crypting = CryptingFactory.createCrypting();

		try
			{
			out.writeObject(crypting.encrypt(message, ServiceRMI.getInstance().getPublicKey()));
			}
		catch (InvalidKeyException e)
			{
			e.printStackTrace();
			}
		}

	private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException
		{
		Crypting_I crypting = CryptingFactory.createCrypting();

		System.out.println("[Message]:readObject : Deserialization custom");
		message = crypting.decrypt((byte[])in.readObject());
		}


	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	//Input
	private String message;

	}
