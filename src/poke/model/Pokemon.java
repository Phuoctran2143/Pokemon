package poke.model;

public abstract class Pokemon
{
	private int healthPoints;
	private int attackPoint;
	private double speed;
	private int number;
	private String name;
	
	
	public Pokemon(String name, int number)
	{
		this.name = name;
		this.number = number; 
	}

	public String getPokemonTypes()
	{
		String pokemonTypes = "This Pokemon has the folowing types:\n";
		Class<?> [] types = getClass().getInterfaces();
		String [] pokeTypes = new String [types.length];
		for(int index = 0; index < types.lenght; index++)
		{
			String temp = types[index].getCanonicalName();
			
			poke[index] = temp;
		}
		
		for(String current : pokeTypes)
		{
			String temp = current.replace(this.getClass().getPackage().getName() + ".", "");
			pokemonTypes += temp + "\n";
		}
		
		return pokemonTypes;
	}
	
}


























