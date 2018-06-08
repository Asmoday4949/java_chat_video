
package ch.hearc.cours.videochat.data;

import java.awt.Color;
import java.util.Random;

public class UserData
	{
	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	private UserData()
		{

		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	public void init(String nickname)
		{
		this.nickname = nickname;
		this.color = this.generateColor();
		}

	/*------------------------------*\
	|*				Set				*|
	\*------------------------------*/

	/*------------------------------*\
	|*				Get				*|
	\*------------------------------*/

	public static UserData getInstance()
		{
		if (instance == null)
			{
			instance = new UserData();
			}

		return instance;
		}

	public String getNickname()
		{
		return this.nickname;
		}

	public Color getColor()
		{
		return this.color;
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	private Color generateColor()
		{
		Random rand = new Random();
		float r = rand.nextFloat();
		float g = rand.nextFloat();
		float b = rand.nextFloat();
		return new Color(r, g, b);
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	private String nickname;
	private Color color;

	private static UserData instance = null;
	}
