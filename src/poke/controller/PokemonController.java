package poke.controller;

import poke.model.*;
import poke.view.PokemonFrame;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PokemonController 
{
	private ArrayList<Pokemon> pokedex;
	private PokemonFrame appFrame;
	
	public void start() 
	{
		
		
	}
	
	public PokemonController()
	{
		pokedex = new ArrayList<Pokemon>();
		buildPokedex();
		
		appFrame = new PokemonFrame(this);
	}
}
