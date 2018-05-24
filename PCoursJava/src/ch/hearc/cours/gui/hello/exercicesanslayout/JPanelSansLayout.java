
package ch.hearc.cours.gui.hello.exercicesanslayout;

import java.awt.Dimension;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.JButton;
import javax.swing.JPanel;

public class JPanelSansLayout extends JPanel
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public JPanelSansLayout()
		{
		geometry();
		control();
		appearence();
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	private void geometry()
		{
		this.setLayout(null);

		jButton1 = new JButton("Button center");
		jButton1.setSize(new Dimension(200, 30));
		add(jButton1);
		}

	private void control()
		{
		this.addComponentListener(new ComponentAdapter()
			{

			@Override
			public void componentResized(ComponentEvent e)
				{ // getHeight() : Methode recherché d'abord dans la classe interne anonyme, s'il elle n'existe pas recherché dans la classe englobante, i.e. dans JPanel
				  // this.getHeight() : est faux, car force le compilateur à rechercher getHeight() chez this et this représente la classe ineterne anonyme, qui ne possède pas de getHeight()
				  // JPanelSansLayout.this.getWidth() : Force l'emploi de la méthode de getwidth() de la classe englobante i.e. de la classe JPanelSansLayout
				  // WARNING : This est une référence sur la classe interne anonyme et non sur la classe englobante
				jButton1.setLocation(JPanelSansLayout.this.getWidth()/2-jButton1.getWidth()/2, getHeight()/2-jButton1.getHeight()/2);
				}
			});
		}

	private void appearence()
		{
		//Rien
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	//Tools
	private JButton jButton1;

	}
