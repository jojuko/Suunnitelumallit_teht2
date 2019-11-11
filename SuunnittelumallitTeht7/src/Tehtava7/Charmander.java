package Tehtava7;

public class Charmander extends PokemonState{
	
	private static PokemonState INSTANCE = new Charmander();
	public int uses = 0;
	
	private Charmander() {
	}
	
	public static PokemonState getInstance() {
		return INSTANCE;
	}

	@Override
	public void attack(Pokemon pokemon) {
		System.out.println("Chramander uses Ember\n");
		uses++;
			if(uses > 2) {
				evolve(pokemon, Charmaleon.getInstance());
				System.out.println("Charmander evolves into Charmaleon\n");
				uses = 0;
			}
		
	}

	@Override
	public void growl(Pokemon pokemon) {
		System.out.println("Charmander growl: grrrr!\n");
		
	}

	@Override
	public void defend(Pokemon pokemon) {
		System.out.println("Chramander uses Evasion\n");
		
	}

}
