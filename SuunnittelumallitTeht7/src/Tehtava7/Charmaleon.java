package Tehtava7;

public class Charmaleon extends PokemonState{
	private static PokemonState INSTANCE = new Charmaleon();
	public int uses = 0;
	
	private Charmaleon() {
	}
	
	public static PokemonState getInstance() {
		return INSTANCE;
	}

	@Override
	public void attack(Pokemon pokemon) {
		System.out.println("Chramaleon uses Flamethrower\n");
		uses++;
			if(uses > 2) {
				evolve(pokemon, Charizard.getInstance());
				System.out.println("Charmaleon evolves into Charizard\n");
				uses = 0;
			}
		
	}

	@Override
	public void growl(Pokemon pokemon) {
		System.out.println("Charmaleon growl: Grauh!!\n");
		
	}

	@Override
	public void defend(Pokemon pokemon) {
		System.out.println("Chramaleon uses Fire Shield!\n");
		
	}

}
