
package ch.hearc.cours.tools;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class BufferedImageTools
	{

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	/*------------------------------*\
	|*			  Static			*|
	\*------------------------------*/

	public static BufferedImage convertToGrayScale(BufferedImage colorImage)
		{
		BufferedImage grayImage = new BufferedImage(colorImage.getWidth(), colorImage.getHeight(), BufferedImage.TYPE_BYTE_GRAY);
		Graphics g = grayImage.getGraphics();
		g.drawImage(colorImage, 0, 0, null);
		g.dispose();

		return grayImage;
		}
	}
