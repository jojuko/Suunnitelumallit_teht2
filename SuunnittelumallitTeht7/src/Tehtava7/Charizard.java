package Tehtava7;

public class Charizard extends PokemonState{
	private static PokemonState INSTANCE = new Charizard();
	
	private Charizard() {
	}
	
	public static PokemonState getInstance() {
		return INSTANCE;
	}

	@Override
	public void attack(Pokemon pokemon) {
		System.out.println("Charizard uses Fire Blast!\n");
		
	}

	@Override
	public void growl(Pokemon pokemon) {
		System.out.println("Charizard growl: RAWR!!!!!\n");
		
	}

	@Override
	public void defend(Pokemon pokemon) {
		System.out.println("Charizard uses Flame Guard!");
		System.out.println("Charizard starts Flying!\n");
	}

}
