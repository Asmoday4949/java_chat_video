
package ch.hearc.cours.advanced.flux.Serialization;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Equipe implements Serializable
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public Equipe(String name)
		{
		this.listPlayer = new ArrayList<>();
		this.name = name;
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	@Override
	public String toString()
		{
		StringBuilder builder = new StringBuilder();
		builder.append("Equipe [name=");
		builder.append(this.name);
		builder.append(", listPlayer=");
		builder.append(this.listPlayer);
		builder.append("]");
		return builder.toString();
		}

	public void add(Player player)
		{
		listPlayer.add(player);
		}

	/*------------------------------*\
	|*				Get				*|
	\*------------------------------*/

	public String getName()
		{
		return this.name;
		}

	public List<Player> getListPlayer()
		{
		return this.listPlayer;
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	//Input
	private String name;

	//Tools
	private List<Player> listPlayer;

	}
