
package ch.hearc.cours.videochat.webcam;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import javax.imageio.ImageIO;

public class WebcamImage implements Serializable, Webcam_I
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/
	public WebcamImage()
		{
		this.webcamImage = null;
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/


	/*------------------------------*\
	|*				Set				*|
	\*------------------------------*/

	public void setImage(BufferedImage image)
		{
		this.webcamImage = image;
		}

	/*------------------------------*\
	|*				Get				*|
	\*------------------------------*/

	@Override
	public BufferedImage getImage()
		{
		return this.webcamImage;
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	/*------------------------------*\
	|*		Serialisation			*|
	\*------------------------------*/

	private void writeObject(ObjectOutputStream out) throws IOException
		{
		ImageIO.write(this.webcamImage, "jpeg", out);
		}

	private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException
		{
		this.webcamImage = ImageIO.read(in);
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	private BufferedImage webcamImage;

	}
