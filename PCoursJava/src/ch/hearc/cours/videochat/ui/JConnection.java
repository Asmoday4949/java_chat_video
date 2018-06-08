
package ch.hearc.cours.videochat.ui;

import java.awt.GridLayout;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;

import org.apache.commons.validator.routines.InetAddressValidator;

public class JConnection extends JPanel
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public JConnection()
		{
		//super(BoxLayout.Y_AXIS);

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

	private void geometry()
		{
		jLabelNickName = new JLabel("Pseudo: ");
		jLabelIP = new JLabel("IP: ");
		jLabelPort = new JLabel("Port: ");

		jNickname = new JTextField();
		jIP = new JTextField();
		jPort = new JSpinner();

		jButtonConnection = new JButton("Connexion");

		GridLayout layout = new GridLayout(-1, 1);
		this.setLayout(layout);

		layout.setHgap(0);
		layout.setVgap(0);

		this.add(jLabelNickName);
		this.add(jNickname);
		this.add(jLabelIP);
		this.add(jIP);
		this.add(jLabelPort);
		this.add(jPort);
		this.add(Box.createVerticalStrut(SPACE));
		this.add(jButtonConnection);
		this.add(Box.createVerticalGlue());
		}

	private void control()
		{
		SpinnerNumberModel model = new SpinnerNumberModel(MIN_PORT, MIN_PORT, MAX_PORT, 1);
		this.jPort.setModel(model);
		this.jPort.setEditor(new JSpinner.NumberEditor(this.jPort, "#####"));

		jButtonConnection.addActionListener((e) -> {
		if (validateForm())
			{
			ServiceGUI.getInstance().connect(jNickname.getText(), jIP.getText(), (Integer)jPort.getValue());
			}
		});
		}

	private void appearance()
		{
		this.jNickname.setHorizontalAlignment(SwingConstants.CENTER);
		this.jIP.setHorizontalAlignment(SwingConstants.CENTER);
		}

	private boolean validateForm()
		{
		InetAddressValidator validator = new InetAddressValidator();

		return validator.isValid(this.jIP.getText());
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	// Tools
	private JLabel jLabelNickName;
	private JLabel jLabelIP;
	private JLabel jLabelPort;
	private JTextField jNickname;
	private JTextField jIP;
	private JSpinner jPort;
	private JButton jButtonConnection;

	static final private  int MIN_PORT = 1024;
	static final private  int MAX_PORT = 65535;

	static final private int SPACE = 20;
	static final private int JINPUT_WIDTH = 300;

	}
