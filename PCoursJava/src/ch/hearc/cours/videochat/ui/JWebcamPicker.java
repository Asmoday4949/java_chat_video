
package ch.hearc.cours.videochat.ui;

import java.awt.BorderLayout;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;

import org.junit.Assert;

import com.github.sarxos.webcam.Webcam;

import ch.hearc.cours.videochat.network.ServiceRMI;
import ch.hearc.cours.videochat.webcam.ServiceWebcam;

public class JWebcamPicker extends JPanel
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public JWebcamPicker()
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

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	private void geometry()
		{
		// JComponent : Instanciation
		this.jWebcamsList = new JComboBox<Webcam>();
		this.buildJWebcamsList();
		this.jButtonStop = new JButton("Stop webcam");
		this.jButtonStart = new JButton("Start webcam");

		// Layout : Specification
		BorderLayout layout = new BorderLayout();
		setLayout(layout);

		// JComponent : add
		this.add(this.jWebcamsList, BorderLayout.CENTER);
		this.add(this.jButtonStop, BorderLayout.EAST);

		}

	private void control()
		{
		this.jWebcamsList.addPopupMenuListener(new PopupMenuListener()
			{

			@Override
			public void popupMenuWillBecomeVisible(PopupMenuEvent e)
				{
				buildJWebcamsList();
				}

			@Override
			public void popupMenuWillBecomeInvisible(PopupMenuEvent e)
				{
				// nothing
				}

			@Override
			public void popupMenuCanceled(PopupMenuEvent e)
				{
				// nothing
				}
			});

		this.jWebcamsList.addActionListener((e) -> {

		if (jWebcamsList.getSelectedItem() != null)
			{
			new Thread(() -> {
			ServiceWebcam.getInstance().setWebcamDevice((Webcam)jWebcamsList.getSelectedItem());
			}).start();
			}
		});

		jButtonStop.addActionListener((e)->{
			remove(jButtonStop);
			add(jButtonStart, BorderLayout.EAST);
			ServiceRMI.getInstance().stopSendWebcam();
			revalidate();
		});

		jButtonStart.addActionListener((e)->{
			remove(jButtonStart);
			add(jButtonStop, BorderLayout.EAST);
			ServiceRMI.getInstance().startSendWebcam();
			revalidate();
		});

		}

	private void appearance()
		{
		// Rien
		}

	private void buildJWebcamsList()
		{
		Assert.assertTrue(this.jWebcamsList != null);

		this.jWebcamsList.removeAllItems();

		List<Webcam> listWebcams = ServiceWebcam.getInstance().getListWebcams();

		for(Webcam webcam:listWebcams)
			{
			this.jWebcamsList.addItem(webcam);
			}
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	// Tools
	private JComboBox<Webcam> jWebcamsList;
	private JButton jButtonStop;
	private JButton jButtonStart;

	}
