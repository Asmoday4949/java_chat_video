package ch.hearc.cours.videochat.webcam;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

import org.junit.Assert;

import com.github.sarxos.webcam.Webcam;

public class JDisplayWebcam extends JPanel
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public JDisplayWebcam()
		{
		this.webcam = Webcam.getDefault();

		Assert.assertTrue(this.webcam != null);

		geometry();
		control();
		appearance();

		this.webcam.open();

		this.image = this.webcam.getImage();


		this.webcam.close();
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	@Override
	protected void paintComponent(Graphics g)
		{
		super.paintComponent(g);

		Graphics2D g2d = (Graphics2D)g;
		AffineTransform transform = g2d.getTransform();

		this.draw(g2d);

		g2d.setTransform(transform);
		}

	private void draw(Graphics2D g2d)
		{
		g2d.drawImage(this.image,0,0, this.image.getWidth(), image.getHeight(), null);
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

	// Tools
	private Webcam webcam;
	private BufferedImage image;

	}
