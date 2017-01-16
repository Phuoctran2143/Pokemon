package poke.model;


public class Bulbasaur extends Pokemon implements Grass
{
	public Bulbasaur()
	{
		super("Bulbasaur", 1);
	}
	public Bulbasaur(String name)
	{
		super(name, 1);
	}
	
	public int frenzyPlant()
	{
		return 20;
	}
	
	public int vineAttack()
	{
		return 20;
	}

}
