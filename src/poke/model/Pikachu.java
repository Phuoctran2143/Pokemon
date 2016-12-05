package poke.model;

public class Pikachu extends Pokemon implements Electric 
{
	public Pikachu()
	{
		super("Pikachu", 25);
	}
	
	public Pikachu(String name)
	{
		super(name,25);
	}
	/**
	 * Two parameter constructor 
	 * @param name
	 * @param number
	 */
	public Pikachu(String name, int number)
	{
		super(name, number);
	}
	public int staticZap()
	{
		return 2;
	}
	public int thunder()
	{
		return this.getAttackPoints() * 2;
	}
}
