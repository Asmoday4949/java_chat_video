
package ch.hearc.cours.videochat.crypt;

import java.io.UnsupportedEncodingException;
import java.security.PublicKey;

public class DumbCrypting implements Crypting_I
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	private DumbCrypting()
		{
		// nothing
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	@Override
	public byte[] encrypt(String stringToCrypt, PublicKey key)
		{
		return (stringToCrypt + " IT IS SAFELY CRYPTED").getBytes();
		}

	@Override
	public String decrypt(byte[] data)
		{
		String encryptedString = "";
		try
			{
			encryptedString = new String(data, ENCODING);
			}
		catch (UnsupportedEncodingException e)
			{
			e.printStackTrace();
			}

		return encryptedString.substring(0, encryptedString.length() - 21);
		}

	/*------------------------------*\
	|*			  Static			*|
	\*------------------------------*/

	public static DumbCrypting getInstance()
		{
		if(instance == null)
			{
			instance = new DumbCrypting();
			}

		return instance;
		}

	/*------------------------------*\
	|*				Get				*|
	\*------------------------------*/

	@Override
	public PublicKey getPublicKey()
		{
		return null; // no public key in dumb crypting
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	/*------------------------------*\
	|*			  Static			*|
	\*------------------------------*/

	private final static String ENCODING = "UTF-8";
	private static DumbCrypting instance = null;
	}
