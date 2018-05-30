
package ch.hearc.cours.videochat.webcam;

import ch.hearc.cours.gui.tools.JFrameComponent;

public class UseTestWebcam
	{
	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	public static void main(String[] args)
		{
		main();
		}

	public static void main()
		{
		new JFrameComponent(new JDisplayWebcam());
		}
	}
