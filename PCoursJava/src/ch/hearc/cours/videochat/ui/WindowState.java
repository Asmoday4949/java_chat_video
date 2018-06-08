
package ch.hearc.cours.videochat.ui;

import java.awt.Image;

import ch.hearc.cours.tools.gui.MagasinImage;

public enum WindowState
	{
WEBCAM_LOADING(MagasinImage.WEBCAM.getImage()), DISCONNECTED(MagasinImage.DISCONNECTED.getImage()), CONNECTION_ERROR(MagasinImage.ERROR.getImage()), CONNECTED(null);

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	private WindowState(Image image)
		{
		this.image = image;
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	/*------------------------------*\
	|*				Get				*|
	\*------------------------------*/

	public Image getImage()
		{
		return this.image;
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	private Image image;
	}
