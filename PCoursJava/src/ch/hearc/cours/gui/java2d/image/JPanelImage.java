
package ch.hearc.cours.gui.java2d.image;

import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;

import javax.swing.JButton;
import javax.swing.JPanel;

import ch.hearc.cours.gui.tools.MagasinImage;

public class JPanelImage extends JPanel
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public JPanelImage()
		{
		geometry();
		control();
		appearance();
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

		this.dessiner(g2d);

		g2d.setTransform(transform);
		}

	private void dessiner(Graphics2D g2d)
		{
		g2d.drawImage(MagasinImage.COFFEE.getImage(), 0, 0, MagasinImage.COFFEE.getIconWidth(), MagasinImage.COFFEE.getIconHeight(), null);
		//observer : this si besoin sinon null
		}

	private void geometry()
		{
		// JComponent : Instanciation
		this.jButton = new JButton(MagasinImage.WARNING);

		// Layout : Specification
			{
			FlowLayout flowlayout = new FlowLayout(FlowLayout.CENTER);
			setLayout(flowlayout);
			}

		// JComponent : add
		this.add(this.jButton);
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
	private JButton jButton;

	}
