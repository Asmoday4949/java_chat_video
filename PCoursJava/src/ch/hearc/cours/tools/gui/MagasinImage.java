
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

	public static final ImageIcon WARNING = ImageLoader.loadSynchroneJar("ressources/warning.png");
	public static final ImageIcon COFFEE = ImageLoader.loadSynchroneJar("ressources/coffee_logo.png");
	public static final ImageIcon LINUX = ImageLoader.loadSynchroneJar("ressources/linux.png");

	/*------------------------------------------------------------------*\
	|*		Version Assynchrone	(non bloquant)							*|
	\*------------------------------------------------------------------*/

	//public static final ImageIcon warning = ImageLoader.loadAsynchroneJar("ressources/warning.png");
	//public static final ImageIcon coffee = ImageLoader.loadAsynchroneJar("ressources/coffee_logo.png");

	}
