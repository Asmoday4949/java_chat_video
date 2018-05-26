
package ch.hearc.cours.videochat.webcam;

import java.awt.Dimension;

public enum WebcamResolution
	{
FULL_HD(new Dimension(1920, 1080)), HD(new Dimension(1280, 720)), SD(new Dimension(640, 480));

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	private WebcamResolution(Dimension dimension)
		{
		this.dimension = dimension;
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	/*------------------------------*\
	|*				Get				*|
	\*------------------------------*/

	public Dimension getDimension()
		{
		return this.dimension;
		}

	public static Dimension[] getAllDimensions()
		{
		int lengthArrayDimension = WebcamResolution.values().length;
		Dimension[] arrDimension = new Dimension[lengthArrayDimension];
		WebcamResolution[] arrResolution = WebcamResolution.values();

		for(int i = 0; i < lengthArrayDimension; i++)
			{
			arrDimension[i] = arrResolution[i].getDimension();
			}

		return arrDimension;
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	//Input, Output
	private Dimension dimension;
	}
