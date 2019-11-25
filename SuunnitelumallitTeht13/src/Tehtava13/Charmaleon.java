package Tehtava13;

public class Charmaleon extends PokemonState{
	private static PokemonState INSTANCE = new Charmaleon();
	private int attacks = 0;
	
	private Charmaleon() {
	}
	
	public static PokemonState getInstance() {
		return INSTANCE;
	}

	@Override
	public void attack(Pokemon pokemon, Visitor v) {
		System.out.println("Chramaleon uses Flamethrower\n");
		attacks += 1;
		v.visit(this, pokemon);
		
	}

	@Override
	public void growl(Pokemon pokemon) {
		System.out.println("Charmaleon growl: Grauh!!\n");
		
	}

	@Override
	public void defend(Pokemon pokemon) {
		System.out.println("Chramaleon uses Fire Shield!\n");
		
	}

	public int getAttacks() {
		return attacks;
	}
	

}
