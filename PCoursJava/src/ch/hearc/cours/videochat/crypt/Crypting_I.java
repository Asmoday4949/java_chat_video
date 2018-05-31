
package ch.hearc.cours.videochat.crypt;

import java.security.InvalidKeyException;
import java.security.PublicKey;

public interface Crypting_I
	{
	public byte[] encrypt(byte[] data, PublicKey key) throws InvalidKeyException;

	public byte[] decrypt(byte[] data);

	PublicKey getPublicKey();

	}