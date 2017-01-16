package poke.controller;

import java.util.ArrayList;

import poke.model.*;
import poke.view.PokemonFrame;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PokemonController
{
	private ArrayList<Pokemon> pokedex;
	private PokemonFrame baseFrame;
	
	public PokemonController()
	{
		pokedex = new ArrayList<Pokemon>();
		buildPokedex();
		
		baseFrame = new PokemonFrame(this);
	}
	
	
	public void start()
	{
	
		JOptionPane.showMessageDialog(baseFrame, "Hello, Welcome");
	}
	
	private void buildPokedex()
	{
		pokedex.add(new Geodude("Geodude"));
		pokedex.add(new Pikachu("Pikachu"));
		pokedex.add(new Raichu("Raichu"));
		pokedex.add(new Charizard("Charizard"));
		pokedex.add(new Bulbasaur("Bulbasaur"));
		pokedex.add(new Squirtle("Squirtle"));
		
	}
	
	public void updateSelected(int index, String name, int combat, int health, double speed)
	{
		Pokemon current = pokedex.get(index);
		current.setName(name);
		current.setAttackPoints(combat);
		current.setSpeed(speed);
		current.setHealthPoints(health);
	}
	
	public ArrayList<Pokemon> getPokedex() 
	{
		
		return pokedex;
	}


	public void setPokedex(ArrayList<Pokemon> pokedex) 
	{
		this.pokedex = pokedex;
	}
	
	public PokemonFrame getBaseFrame() 
	{
		return baseFrame;
	}

	public void setBaseFrame(PokemonFrame baseFrame) 
	{
		this.baseFrame = baseFrame;
	}
	
	public String[] getPokedexNames()
	{
		String[] names = new String [pokedex.size()];
		
		for (int index = 0; index < pokedex.size(); index ++)
		{
			names[index] = pokedex.get(index).getName();
		}
		
		return names;
	}
	
	
}