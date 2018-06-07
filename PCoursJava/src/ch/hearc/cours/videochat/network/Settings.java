
package ch.hearc.cours.videochat.network;

import java.io.IOException;
import java.io.Serializable;
import java.net.InetAddress;
import java.net.UnknownHostException;

import ch.hearc.cours.tools.advanced.flux.SerializerFileTools;

import com.bilat.tools.reseau.rmi.RmiAddress;

public class Settings implements Serializable
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	private Settings()
		{
		localAddress = RmiAddress.createLocal().getLocal();
		System.setProperty("java.rmi.server.hostname", localAddress.getHostAddress()); // Patch linux: ip of localhost
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	public static void patchLocal(String address)
		{
		System.out.println("[Settings] : patchLocal : patch local address fix for linux");
		localAddress = getByName(address);
		System.setProperty("java.rmi.server.hostname", address); // Patch linux: ip of localhost
		}

	public static void init(String address, int remotePort, int localPort)
		{
		remoteAddress = getByName(address);
		Settings.remotePort = remotePort;
		Settings.localPort = localPort;
		}

	/*------------------------------*\
	|*				Get				*|
	\*------------------------------*/

	public InetAddress getLocal()
		{
		return localAddress;
		}

	public InetAddress getRemote()
		{
		return remoteAddress;
		}

	public int getLocalPort()
		{
		return localPort;
		}

	public int getRemotePort()
		{
		return remotePort;
		}

	/*------------------------------*\
	|*			  Static			*|
	\*------------------------------*/

	public static Settings getInstance()
		{
		if (instance == null)
			{
			instance = new Settings();
			}
		return instance;
		}

	public static void save()
		{
		try
			{
			SerializerFileTools.serialize(FILE_SETTINGS, instance);
			}
		catch (ClassNotFoundException | IOException e)
			{
			e.printStackTrace();
			}
		}

	public static void load()
		{
		try
			{
			instance = (Settings)SerializerFileTools.unserialize(FILE_SETTINGS);
			}
		catch (ClassNotFoundException | IOException e)
			{
			e.printStackTrace();
			}
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	public static InetAddress getByName(final String host)
		{
		try
			{
			return InetAddress.getByName(host);
			}
		catch (UnknownHostException e)
			{
			e.printStackTrace();
			}
		return null;
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	// Output
	private static InetAddress localAddress;
	private static InetAddress remoteAddress;
	private static int localPort;
	private static int remotePort;

	/*------------------------------*\
	|*			  Static			*|
	\*------------------------------*/

	private static Settings instance;

	public static final String ID_CHAT = "CHAT";
	private static final String FILE_SETTINGS = "settings.ini";

	}
