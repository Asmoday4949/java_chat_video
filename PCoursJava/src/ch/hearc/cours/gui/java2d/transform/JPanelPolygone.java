
package ch.hearc.cours.gui.java2d.transform;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.geom.Line2D;

import javax.swing.JPanel;

public class JPanelPolygone extends JPanel
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/


	public JPanelPolygone(int n, double longueur)
		{
		this.n = n;
		this.longueur = longueur;

		this.line = new Line2D.Double(-this.longueur / 2, 0, this.longueur/2, 0);
		}

	public JPanelPolygone()
		{
		this(12, 100);
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
		g2d.translate(this.getWidth() / 2, this.getHeight() / 2); //mettre le contexte graphique au centre de la fenêtre

		double angle = 2*Math.PI / this.n;
		double yPos = this.longueur / 2 / Math.tan(angle/2);

		for(int i = 0; i < this.n; i++)
			{
			g2d.rotate(angle);
			g2d.translate(0,yPos);
			g2d.draw(this.line);
			g2d.translate(0, -yPos);
			}

		g2d.translate(-this.getWidth() / 2, -this.getHeight() / 2);
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	//input
	private int n;
	private double longueur;

	//tools
	private Line2D line;
	}
