
package ch.hearc.cours.videochat.crypt;

import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

public class AsymmetricCrypting implements Crypting_I
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public AsymmetricCrypting()
		{
		try
			{
			KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");

			keyGen.initialize(1024);

			KeyPair pair = keyGen.generateKeyPair();

			this.privateKey = pair.getPrivate();
			this.publicKey = pair.getPublic();
			}
		catch (NoSuchAlgorithmException e)
			{
			e.printStackTrace();
			}
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	@Override
	public byte[] encrypt(byte[] data, PublicKey key) throws InvalidKeyException
		{
		Cipher cipher;
		try
			{
			cipher = Cipher.getInstance("RSA");
			cipher.init(Cipher.ENCRYPT_MODE, publicKey);

			return cipher.doFinal(data);
			}
		catch (NoSuchAlgorithmException | NoSuchPaddingException | IllegalBlockSizeException | BadPaddingException e)
			{
			e.printStackTrace();

			return null;
			}

		}

	@Override
	public byte[] decrypt(byte[] encryptedData)
		{
		Cipher cipher;
		try
			{
			cipher = Cipher.getInstance("RSA");
			cipher.init(Cipher.DECRYPT_MODE, this.privateKey);

			return cipher.doFinal(encryptedData);

			}
		catch (InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException | IllegalBlockSizeException | BadPaddingException e)
			{
			e.printStackTrace();

			return null;
			}
		}

	/*------------------------------*\
	|*				Get				*|
	\*------------------------------*/

	@Override
	public PublicKey getPublicKey()
		{
		return this.publicKey;
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	private PrivateKey privateKey;
	private PublicKey publicKey;
	}
