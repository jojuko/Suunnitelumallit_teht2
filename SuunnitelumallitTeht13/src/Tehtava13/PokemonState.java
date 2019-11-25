package Tehtava13;

public abstract class PokemonState {
	public abstract void attack(Pokemon pokemon, Visitor visitor);
	public abstract void growl(Pokemon pokemon);
	public abstract void defend(Pokemon pokemon);
	public void evolve(Pokemon pokemon, PokemonState s) {
		pokemon.evolve(s);
	}

}
