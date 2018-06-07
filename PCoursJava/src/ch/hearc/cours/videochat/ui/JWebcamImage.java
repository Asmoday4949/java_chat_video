
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

	// https://java.developpez.com/faq/gui?page=Les-images#Comment-redimensionner-une-image
	public BufferedImage scale(BufferedImage source, int width, int height)
		{
		double ratio = ((double)source.getWidth() / (double)source.getHeight());
		int newWidth;
		int newHeight;

		if (width < height)
			{
			newWidth = width;
			newHeight = (int)(width / ratio);
			}
		else
			{
			newWidth = (int)(ratio * height);
			newHeight = height;
			}

		BufferedImage buf = new BufferedImage(newWidth, newHeight, BufferedImage.TYPE_INT_ARGB);

		Graphics2D g = buf.createGraphics();
		g.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
		g.drawImage(source, 0, 0, newWidth, newHeight, null);
		g.dispose();

		return buf;
		}

	/*------------------------------*\
	|*				Set				*|
	\*------------------------------*/

	public void setDestinationImage(BufferedImage bufferedImage)
		{
		this.bufferedImageDestination = bufferedImage;

		this.repaint();
		}

	public void setSourceImage(BufferedImage bufferedImage)
		{
		this.bufferedImageSource = bufferedImage;

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

		this.drawImageDestinationCenter(g2d);
		this.drawSourceImage(g2d);

		g2d.setTransform(transform);
		}

	private void drawImageDestinationCenter(Graphics2D g2d)
		{
		if (bufferedImageDestination != null)
			{
			BufferedImage resultImage = scale(bufferedImageDestination, this.getWidth(), this.getHeight());

			int posX = this.getWidth() / 2 - resultImage.getWidth() / 2;
			int posY = this.getHeight() / 2 - resultImage.getHeight() / 2;

			g2d.drawImage(resultImage, posX, posY, resultImage.getWidth(), resultImage.getHeight(), null);
			}
		}

	private void drawSourceImage(Graphics2D g2d)
		{
		final double percentageWidth = 0.15d;
		final double percentageMargin = 0.05d;

		if(this.bufferedImageSource != null)
			{
			int wantedWidth = (int)(this.getWidth() * percentageWidth);
			int wantedHeight = (int)((double)wantedWidth / (double)this.bufferedImageSource.getWidth() * this.bufferedImageSource.getHeight());

			double percentagePos = 1 - percentageMargin - percentageWidth;

			int xPos = (int)(this.getWidth() * percentagePos);
			int yPos = (int)(this.getHeight() * percentagePos);

			BufferedImage resultImage = scale(this.bufferedImageSource, wantedWidth, wantedHeight);

			g2d.drawImage(resultImage, xPos, yPos, resultImage.getWidth(), resultImage.getHeight(), null);
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

	private BufferedImage bufferedImageDestination;
	private BufferedImage bufferedImageSource;
	}
