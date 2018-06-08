
package ch.hearc.cours.videochat.ui;

import java.awt.BorderLayout;

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
	|*				Get				*|
	\*------------------------------*/

	public JWebcamImage getJWebcamImage()
		{
		return this.jWebcamImage;
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	private void geometry()
		{
		// JComponent : Instanciation
		this.jWebcamImage = new JWebcamImage();
		this.jWebcamPicker = new JWebcamPicker();

		// Layout : Specification
		BorderLayout layout = new BorderLayout();
		setLayout(layout);

		// JComponent : add
		this.add(this.jWebcamImage, BorderLayout.CENTER);
		this.add(this.jWebcamPicker, BorderLayout.SOUTH);
		}

	private void control()
		{
		// nothing
		}

	private void appearance()
		{
		// nothing
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	// Tools
	private JWebcamImage jWebcamImage;
	private JWebcamPicker jWebcamPicker;
	}
