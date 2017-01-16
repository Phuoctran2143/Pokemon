package poke.model;

import poke.controller.PokemonController;

public class Raichu extends Pokemon implements Electric
{
	public Raichu()
	{
		super("Raichu",26);
	}
	
	public Raichu(String name)
	{
		super(name, 26);
	}
	
	public Raichu(String name, int number)
	{
		super(name, number);
	}
	
	public int staticZap()
	{
		return 20;
	}
	
	public int thunder()
	{
		return this.getAttackPoints() * 20;
	}

}
