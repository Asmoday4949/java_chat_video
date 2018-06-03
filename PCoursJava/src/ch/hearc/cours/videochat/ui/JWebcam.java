
package ch.hearc.cours.videochat.ui;

import java.awt.BorderLayout;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;

import org.junit.Assert;

import com.github.sarxos.webcam.Webcam;

import ch.hearc.cours.videochat.webcam.ServiceWebcam;

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
		this.jWebcamsList = new JComboBox<Webcam>();
		this.buildJWebcamsList();
		this.jWebcamImage = new JWebcamImage();

		// Layout : Specification
			{
			BorderLayout layout = new BorderLayout();
			setLayout(layout);
			}

		// JComponent : add
		this.add(this.jWebcamImage, BorderLayout.CENTER);
		this.add(this.jWebcamsList, BorderLayout.SOUTH);
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
		}

	private void appearance()
		{
		// nothing
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
	private JWebcamImage jWebcamImage;
	private JComboBox<Webcam> jWebcamsList;
	}
