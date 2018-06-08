
package ch.hearc.cours.tools.gui;

import java.awt.Dimension;

import javax.swing.JComponent;

public class JComponentTool
	{

	/*------------------------------*\
	|*			  Static			*|
	\*------------------------------*/

	public static void setPreferredWidth(JComponent component, int width)
		{
		Dimension dimension = component.getPreferredSize();
		dimension.width = width;
		component.setPreferredSize(dimension);
		}

	public static void setMaximumWidth(JComponent component, int width)
		{
		Dimension dimension = component.getMaximumSize();
		dimension.width = width;
		component.setMaximumSize(dimension);
		}

	public static void setMinimumWidth(JComponent component, int width)
		{
		Dimension dimension = component.getMinimumSize();
		dimension.width = width;
		component.setMinimumSize(dimension);
		}

	public static void setPreferredHeight(JComponent component, int height)
		{
		Dimension dimension = component.getPreferredSize();
		dimension.height = height;
		component.setPreferredSize(dimension);
		}

	public static void setMaximumHeight(JComponent component, int height)
		{
		Dimension dimension = component.getPreferredSize();
		dimension.height = height;
		component.setMaximumSize(dimension);
		}

	public static void setMinimumHeight(JComponent component, int height)
		{
		Dimension dimension = component.getMinimumSize();
		dimension.height = height;
		component.setMinimumSize(dimension);
		}


	}
