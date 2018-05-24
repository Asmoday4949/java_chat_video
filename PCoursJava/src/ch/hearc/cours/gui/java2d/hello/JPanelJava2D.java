
package ch.hearc.cours.gui.java2d.hello;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;

public class JPanelJava2D extends JPanel
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public JPanelJava2D()
		{
		this.hello = "Hello";
		this.line2d = new Line2D.Double(90, 90, 120, 120); //x0 y0 x1 y1
		this.rectangle2d = new Rectangle2D.Double(150, 150, 200, 200);//coinHautGauche, x0 y0; largeur, hauteur
		this.ellipse2d = new Ellipse2D.Double(0, 0, 40, 80);//x0 y0 w h
		this.arc2d = new Arc2D.Double(400, 400, 100, 100, 45, 270, Arc2D.PIE);//x0 y0 w h angle_depart angle_d_ouverture (°) comment_fermer_la_forme

		this.colorArc = new Color(127, 64, 32);
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	@Override
	protected void paintComponent(Graphics g)
		{
		super.paintComponent(g);

		Graphics2D g2D = (Graphics2D)g;
		AffineTransform transform = g2D.getTransform();//sauvegarde l etat repere mathematique
		dessiner(g2D);
		g2D.setTransform(transform);//rend l etat repere mathematique
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	private void dessiner(Graphics2D g2d)
		{
		g2d.drawString(hello, 50, 50);
		g2d.draw(line2d);
		g2d.setColor(Color.RED);
		g2d.fill(rectangle2d); //Draw = contour, fill = remplissage
		g2d.draw(ellipse2d);
		g2d.setColor(colorArc);
		g2d.fill(arc2d);

		g2d.translate(100, 400); //etat
		g2d.setColor(Color.YELLOW);//etat
		g2d.fill(ellipse2d);

		g2d.scale(-2, 0.75);//etat
		g2d.fill(ellipse2d);

		g2d.setColor(Color.BLACK);
		g2d.drawString(hello, -100, 200);
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	//Tools
	private String hello;
	private Line2D line2d;
	private Rectangle2D rectangle2d;
	private Ellipse2D ellipse2d;
	private Arc2D arc2d;

	private Color colorArc;
	}
