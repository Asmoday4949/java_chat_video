
package ch.hearc.cours.advanced.animation;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicInteger;

import javax.swing.JButton;
import javax.swing.JPanel;

import ch.hearc.cours.advanced.tools.ThreadTools;

public class JPanelTransform extends JPanel
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public JPanelTransform(int n, double ratio01)
		{
		this.n = n;
		this.ratio01 = ratio01;
		table = new Rectangle2D.Double(-20, -10, 40, 20);

		//methode d'animation
			{
			this.iAnimation = new AtomicInteger(0);
			alphaAnimation = 0;
			dAlphaAnimation = -2 * Math.PI / 500;
			delayAnimationMS = (int)(1000 / (double)60);

			//animerV1TimerSwing();
			//this.animerV2TimerUtil();
			this.animerV3Thread();
			}

		//button test de réactivité
			{
			this.jButton1 = new JButton("Test réactivité GUI");
			this.jButton2 = new JButton("Test 2");

			ActionListener clic = new ActionListener()
				{

				@Override
				public void actionPerformed(ActionEvent e)
					{
					System.out.println("clic : " + Thread.currentThread().getName());
					}
				};

			this.jButton1.addActionListener(clic);
			this.jButton2.addActionListener(clic);

			this.add(this.jButton1);
			this.add(this.jButton2);
			}
		}

	public JPanelTransform()
		{
		this(9, 0.5);
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
		Graphics2D g2D = (Graphics2D)g;

		//System.out.println("Name thread paintComponent : " + Thread.currentThread().getName());

		AffineTransform transform = g2D.getTransform();//sauvegarde l etat repere mathematique
			{
			dessiner(g2D);
			}
		g2D.setTransform(transform);//rend l etat repere mathematique
		}

	private void dessiner(Graphics2D g2D)
		{
		double centerx = getWidth() / 2;
		double centery = getHeight() / 2;
		double heightdiv2 = centery * ratio01;

		g2D.translate(centerx, centery);

		alphaAnimation = this.iAnimation.get() * this.dAlphaAnimation;
		g2D.rotate(alphaAnimation);

		double theta = 2 * Math.PI / n;

		for(int i = 0; i < n; i++)
			{
			g2D.translate(0, heightdiv2);
			g2D.draw(table);
			g2D.translate(0, -heightdiv2);
			g2D.rotate(theta);
			}

		g2D.rotate(-alphaAnimation);
		g2D.translate(-centerx, -centery);
		}

	/**
	 * pratique ssi peu d'opérations à faire
	 * Avantages : Tout est fait dans le même thread, donc aucun problème de concurrence à gérer
	 * Inconvénient : si beaucoup d'opération à faire, freeze l'interface graphique.
	 * Super désagréable !!!!
	 */
	private void animerV1TimerSwing()
		{
		ActionListener actionListener = new ActionListener()
			{

			@Override
			public void actionPerformed(ActionEvent e)
				{
				animationStep();
				}
			};

		javax.swing.Timer timer = new javax.swing.Timer(delayAnimationMS, actionListener);
		timer.start();
		}

	/**
	 * Avantages : Ne freeze pas l'UI
	 * Inconvénient : Nécessite de gérer la concurrence
	 */
	private void animerV2TimerUtil()
		{
		java.util.Timer timer = new java.util.Timer();

		TimerTask timerTask = new TimerTask()
			{

			@Override
			public void run()
				{
				animationStep();
				}
			};

		timer.scheduleAtFixedRate(timerTask, 0, delayAnimationMS);
		}

	/**
	 * même avantages et inconvénients que V2.
	 * Mais avec plus de flexibilité
	 */
	private void animerV3Thread()
		{
		Runnable runnable = new Runnable()
			{

			@Override
			public void run()
				{
				while(true)
					{
					animationStep();

					ThreadTools.sleep(delayAnimationMS);
					}
				}
			};

		Thread thread = new Thread(runnable);
		thread.setName("THREAD ANIMATION");
		thread.start();
		}

	private void animationStep()
		{
		//alphaAnimation += dAlphaAnimation;
		iAnimation.incrementAndGet();
		repaint();
		System.out.println("Name thread animation : " + Thread.currentThread().getName());

		//simulationLongCalcul();
		}

	private void simulationLongCalcul()
		{
		ThreadTools.sleep(2000);
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	//Input
	private int n;
	private double ratio01;

	private Rectangle2D table;
	private double alphaAnimation;
	private double dAlphaAnimation;
	private AtomicInteger iAnimation;

	private JButton jButton1;
	private JButton jButton2;

	private int delayAnimationMS;

	}
