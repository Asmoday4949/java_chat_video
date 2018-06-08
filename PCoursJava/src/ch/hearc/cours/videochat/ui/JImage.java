
package ch.hearc.cours.videochat.ui;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.AffineTransform;

import javax.swing.JPanel;

public class JImage extends JPanel
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public JImage()
		{
		geometry();
		control();
		appearance();
		}

	public JImage(Image image)
		{
		this();

		this.image = image;
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	/*------------------------------*\
	|*				Set				*|
	\*------------------------------*/

	public void setImage(Image image)
		{
		this.image = image;
		this.repaint();
		}

	/*------------------------------*\
	|*				Get				*|
	\*------------------------------*/

	public Image getImage()
		{
		return this.image;
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	@Override
	protected void paintComponent(Graphics g)
		{
		super.paintComponent(g);

		Graphics2D g2d = (Graphics2D)g;
		AffineTransform transform = g2d.getTransform();

		this.drawGraphics(g2d);

		g2d.setTransform(transform);
		}

	private void drawGraphics(Graphics2D g2d)
		{
		if(this.image != null)
			{
			int imageWidth = this.image.getWidth(null);
			int imageHeight = this.image.getHeight(null);

			g2d.drawImage(this.image, this.getWidth() / 2 - imageWidth / 2, this.getHeight() / 2 - imageHeight / 2, imageWidth, imageHeight, null);
			}
		}

	private void geometry()
		{
		//rien
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

	// Tools
	private Image image;

	}
