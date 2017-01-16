package poke.model;


public class Charizard extends Pokemon implements Fire
{
	public Charizard()
	{
		super("Charizard", 7);
	}
	
	public Charizard(String name)
	{
		super(name, 7);
	}
	
	public int blastFire()
	{
		return 15;
	}
	
	public int flareBlitz()
	{
		return 20;
	}

}

