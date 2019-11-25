package Tehtava13;

public class Charmander extends PokemonState{
	
	private static PokemonState INSTANCE = new Charmander();
	private int attacks = 0;
	
	
	private Charmander() {
	}
	
	public static PokemonState getInstance() {
		return INSTANCE;
	}

	@Override
	public void attack(Pokemon pokemon, Visitor v) {
		System.out.println("Chramander uses Ember\n");
		attacks += 1;
		v.visit(this, pokemon);
	}

	@Override
	public void growl(Pokemon pokemon) {
		System.out.println("Charmander growl: grrrr!\n");
		
	}

	@Override
	public void defend(Pokemon pokemon) {
		System.out.println("Chramander uses Evasion\n");
		
	}

	public int getAttacks() {
		return attacks;
	}
	
	

}
