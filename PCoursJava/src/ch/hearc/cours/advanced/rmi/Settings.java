
package ch.hearc.cours.advanced.rmi;

import java.net.InetAddress;

import com.bilat.tools.reseau.rmi.RmiTools;

public class Settings
	{
	/*------------------------------*\
	|*			  Horloge			*|
	\*------------------------------*/

	public static final int PORT_HORLOGE = RmiTools.PORT_RMI_DEFAUT;
	public static final String ID_HORLOGE = "HORLOGE";
	public static final InetAddress IP_HORLOGE = RmiTools.getLocalHost();

	/*------------------------------*\
	|*			  Secret			*|
	\*------------------------------*/

	public static final int PORT_SECRET = RmiTools.PORT_RMI_DEFAUT;
	public static final String ID_SECRET = "SECRET";
	public static final InetAddress IP_SECRET = RmiTools.getLocalHost();

	}
