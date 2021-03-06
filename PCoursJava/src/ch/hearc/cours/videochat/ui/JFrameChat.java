
package ch.hearc.cours.videochat.ui;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

import ch.hearc.cours.tools.gui.MagasinImage;

public class JFrameChat extends JFrame
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public JFrameChat()
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

	/*------------------------------*\
	|*				Get				*|
	\*------------------------------*/

	public JMain getJMain()
		{
		return this.jMain;
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	private void geometry()
		{
		jMain = new JMain();

		setLayout(new BorderLayout());

		this.add(jMain, BorderLayout.CENTER);
		}

	private void control()
		{
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		}

	private void appearance()
		{
		this.setIconImage(MagasinImage.ARC.getImage());
		this.setMinimumSize(new Dimension(MIN_WIDTH, MIN_HEIGHT));
		this.setSize(1366, 768);
		this.setLocationRelativeTo(null); // frame centrer
		this.setVisible(true); // last!
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	// Tools
	private JMain jMain;

	/*------------------------------*\
	|*			  Static			*|
	\*------------------------------*/

	private static final int MIN_WIDTH = 290;
	private static final int MIN_HEIGHT = 355;

	}
