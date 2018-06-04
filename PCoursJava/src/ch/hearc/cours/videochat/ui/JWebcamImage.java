
package ch.hearc.cours.videochat.ui;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
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

	// https://java.developpez.com/faq/gui?page=Les-images#Comment-redimensionner-une-image
	public BufferedImage scale(BufferedImage source, int width, int height)
		{
		double ratio = ((double)source.getWidth() / (double)source.getHeight());
		int newWidth;
		int newHeight;

		if(width < height)
			{
			newWidth = width;
			newHeight = (int)(width / ratio);
			}
		else
			{
			newWidth = (int)(ratio * height);
			newHeight = height;
			}

		System.out.println("Width: " + width + " height: " + height + " Ratio: " + ratio);

		BufferedImage buf = new BufferedImage(newWidth, newHeight, BufferedImage.TYPE_INT_ARGB);

		Graphics2D g = buf.createGraphics();
		g.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
		g.drawImage(source, 0, 0, newWidth, newHeight, null);
		g.dispose();

		return buf;
		}

	private void drawImageCenter(Graphics2D g2d)
		{
		if (bufferedImage != null)
			{
			BufferedImage resultImage = scale(bufferedImage, this.getWidth(), this.getHeight());

			int posX = this.getWidth() / 2 - resultImage.getWidth() / 2;
			int posY = this.getHeight() / 2 - resultImage.getHeight() / 2;

			g2d.drawImage(resultImage, posX, posY, resultImage.getWidth(), resultImage.getHeight(), null);
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
