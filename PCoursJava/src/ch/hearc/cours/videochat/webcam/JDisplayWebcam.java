
package ch.hearc.cours.videochat.webcam;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.rmi.RemoteException;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JPanel;

import com.github.sarxos.webcam.Webcam;

public class JDisplayWebcam extends JPanel
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public JDisplayWebcam()
		{
		//		this.webcam = Webcam.getDefault();
		//		Dimension fullHDDimension = new Dimension(1920, 1080);
		//		this.webcam.setCustomViewSizes(new Dimension[] { fullHDDimension });
		//		this.webcam.setViewSize(fullHDDimension);
		//
		//		Assert.assertTrue(this.webcam != null);
		//
		geometry();
		control();
		appearance();
		//
		//		this.webcam.open();
		//
		//		this.image = this.webcam.getImage();
		//
		//		this.webcam.close();
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
		if (image != null)
			{
			g2d.drawImage(this.image, 0, 0, this.image.getWidth(), image.getHeight(), null);
			}
		}

	private void geometry()
		{
		// rien
		}

	private void control()
		{
		timer = new Timer();
		timer.scheduleAtFixedRate(new TimerTask()
			{

			@Override
			public void run()
				{
				try
					{
					if (WebcamRemote.isAvailable())
						{
						image = WebcamRemote.getInstance().getWebcam().getImage();
						repaint();
						}
					}
				catch (RemoteException e)
					{
					//Rien
					//e.printStackTrace();
					}
				}
			}, 500, 500);
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
	private Timer timer;

	}
