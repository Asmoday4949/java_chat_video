
package ch.hearc.cours.videochat.ui;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

public class JWebcamImage extends JPanel
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public JWebcamImage()
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

		this.repaint();
		}

	/*------------------------------*\
	|*				Get				*|
	\*------------------------------*/

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	@Override
	protected void paintComponent(Graphics g)
		{
		super.paintComponent(g);

		Graphics2D g2d = (Graphics2D)g;
		AffineTransform transform = g2d.getTransform();

		this.drawImageCenter(g2d);

		g2d.setTransform(transform);
		}

	private void drawImageCenter(Graphics2D g2d)
		{
		if (bufferedImage != null)
			{
			int posX = this.getWidth()/2 - bufferedImage.getWidth()/2;
			int posY = this.getHeight()/2 - bufferedImage.getHeight()/2;

			g2d.drawImage(bufferedImage, posX, posY, bufferedImage.getWidth(), bufferedImage.getHeight(), null);
			}
		}

	private void geometry()
		{

		}

	private void control()
		{
		// rien
		}

	private void appearance()
		{
		// rien
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	private BufferedImage bufferedImage;
	}
