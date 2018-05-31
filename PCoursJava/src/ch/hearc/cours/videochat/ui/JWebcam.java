
package ch.hearc.cours.videochat.ui;

import java.awt.image.BufferedImage;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class JWebcam extends JPanel
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public JWebcam()
		{
		geometry();
		control();
		appearance();
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	/*------------------------------*\
	|*				Set				*|
	\*------------------------------*/

	public void setImage(BufferedImage bufferedImage)
		{
		this.bufferedImage = bufferedImage;
		}

	/*------------------------------*\
	|*				Get				*|
	\*------------------------------*/

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	private void geometry()
		{
		// TODO Auto-generated method stub

		}

	private void control()
		{
		// TODO Auto-generated method stub

		}

	private void appearance()
		{
		// TODO Auto-generated method stub

		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	private BufferedImage bufferedImage;
	private JLabel jLabelImage;
	}
