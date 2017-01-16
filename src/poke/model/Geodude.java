package poke.model;

public class Geodude extends Pokemon implements Rock
{
	public Geodude()
	{
		super("Geodude", 74);
	}
	
	public Geodude(String name)
	{
		super(name, 74);
	}
	
	public int rockThrow()
	{
		return 20;
	}
	
	public int rockTomb()
	{
		return 20;
	}

}


