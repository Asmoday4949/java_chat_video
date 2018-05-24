
package ch.hearc.cours.gui.hello.jpanel;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JPanelHello extends JPanel
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public JPanelHello()
		{
		geometry();
		control();
		appearence();
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	private void geometry()
		{
		jlabel1 = new JLabel("Text1");
		jbutton1 = new JButton("Button 1");
		jbutton2 = new JButton("Button 2");

		add(jlabel1);
		add(jbutton1);
		add(jbutton2);
		}

	private void control()
		{
		jbutton1.setToolTipText("MyTooltip");

		jbutton1.addActionListener(new ActionListener()
			{

			@Override
			public void actionPerformed(ActionEvent e)
				{
				System.out.println("clic sur le bouton 1");
				}
			});

		jbutton2.addActionListener(new ActionListener()
			{

			@Override
			public void actionPerformed(ActionEvent e)
				{
				System.out.println("clic sur le bouton 2");
				}
			});

		//Exemple de l'implementation de MouseAdapter
		//addMouseListener(new MyMouseAdapter()
		addMouseListener(new MouseAdapter()
			{

			@Override
			public void mouseClicked(MouseEvent e)
				{
				System.out.println("Clic panel x:" + e.getX() + " y:" + e.getY());
				}
			});

		jbutton1.addMouseListener(new MouseAdapter()
			{

			@Override
			public void mouseClicked(MouseEvent e)
				{
				System.out.println("Clic button1 x:" + e.getX() + " y:" + e.getY());
				}
			});

		this.addComponentListener(new ComponentAdapter()
			{

			@Override
			public void componentResized(ComponentEvent e)
				{
				//System.out.println("Resized : w:" + e.getComponent().getWidth() + " h:" + e.getComponent().getHeight());
				System.out.println("Resized : w:" + getWidth() + " h:" + getHeight());
				}
			});
		}

	private void appearence()
		{
		setBackground(Color.MAGENTA);
		jbutton1.setForeground(Color.BLUE);
		jbutton1.setBackground(Color.YELLOW);
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	//Tools
	private JButton jbutton1;
	private JButton jbutton2;
	private JLabel jlabel1;

	}
