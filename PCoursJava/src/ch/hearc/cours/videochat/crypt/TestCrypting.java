
package ch.hearc.cours.videochat.crypt;

import static org.junit.Assert.assertTrue;

import java.security.InvalidKeyException;
import java.security.PublicKey;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestCrypting
	{
	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	@Before
	public void before()
		{
		// rien
		}

	@After
	public void after()
		{
		// rien
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*-----------------------------------------------------------------*/

	@Test
	public void testDefaultCrypting()
		{
		this.testCrypting(CryptingFactory.createCrypting());
		}

	@Test
	public void testAsymmetricCrypting()
		{
		this.testCrypting(CryptingFactory.createAsymmetricCrypting());
		}

	@Test
	public void testDumbCrypting()
		{
		this.testCrypting(CryptingFactory.createDumbCrypting());
		}

	public void testCrypting(Crypting_I crypting)
		{
		PublicKey key = crypting.getPublicKey();

		byte[] encryptedEasy = null;
		byte[] encryptedMedmium = null;
		byte[] encryptedHard = null;

		try
			{
			encryptedEasy = crypting.encrypt(EASY, key);
			encryptedMedmium = crypting.encrypt(MEDIUM, key);
			encryptedHard = crypting.encrypt(HARD, key);
			}
		catch (InvalidKeyException e)
			{
			e.printStackTrace();
			}

		String decryptedEasy = crypting.decrypt(encryptedEasy);
		String decryptedMedium = crypting.decrypt(encryptedMedmium);
		String decryptedHard = crypting.decrypt(encryptedHard);

		System.out.println(decryptedEasy);
		System.out.println(decryptedMedium);
		System.out.println(decryptedHard);

		assertTrue(decryptedEasy.equals(EASY));
		assertTrue(decryptedMedium.equals(MEDIUM));
		assertTrue(decryptedHard.equals(HARD));
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	private final String EASY = "Hello World";
	private final String MEDIUM = "Éléctricité";
	private final String HARD = "안녕하세요";

	}
