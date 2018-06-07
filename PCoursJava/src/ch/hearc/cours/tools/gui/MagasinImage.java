
package ch.hearc.cours.tools.gui;

import javax.swing.ImageIcon;

/**
* Les images doivent se trouver dans un jar, et le jar dans le classpth!
* Le jar doit contenir le folder ressources. A l'interieur du folder ressource doit se trouver les images aux formats (jpg, voir mieux png pour la transparance)
*/
public class MagasinImage
	{

	/*------------------------------------------------------------------*\
	|*		 Version Synchrone (bloquant)								*|
	\*------------------------------------------------------------------*/

	public static final ImageIcon ARC = ImageLoader.loadSynchroneJar("ressources/arc.png");
	public static final ImageIcon SEND = ImageLoader.loadSynchroneJar("ressources/send.png");
	public static final ImageIcon ERROR = ImageLoader.loadSynchroneJar("ressources/error.png");
	public static final ImageIcon DISCONNECTED = ImageLoader.loadSynchroneJar("ressources/disconnected.png");
	public static final ImageIcon WEBCAM = ImageLoader.loadSynchroneJar("ressources/webcam.png");

	/*------------------------------------------------------------------*\
	|*		Version Assynchrone	(non bloquant)							*|
	\*------------------------------------------------------------------*/

	//public static final ImageIcon ARC = ImageLoader.loadAsynchroneJar("ressources/arc.png");
	//public static final ImageIcon SEND = ImageLoader.loadAsynchroneJar("ressources/send.png");
	//public static final ImageIcon ERROR = ImageLoader.loadAsynchroneJar("ressources/error.png");
	//public static final ImageIcon DISCONNECTED = ImageLoader.loadAsynchroneJar("ressources/disconnected.png");
	//public static final ImageIcon WEBCAM = ImageLoader.loadAsynchroneJar("ressources/webcam.png");

	}
