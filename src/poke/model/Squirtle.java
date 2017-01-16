package poke.model;

public class Squirtle extends Pokemon implements Water
{
	public Squirtle()
	{
		super("Squirtle", 9);
	}
	
	public Squirtle(String name)
	{
		super(name, 9);
	}
	
	public int shootWater()
	{
		return 20;
	}
	
	public int bubbleAttack()
	{
		return 20;
	}

}


