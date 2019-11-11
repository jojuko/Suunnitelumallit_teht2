package Tehtava7;

public abstract class PokemonState {
	public abstract void attack(Pokemon pokemon);
	public abstract void growl(Pokemon pokemon);
	public abstract void defend(Pokemon pokemon);
	public void evolve(Pokemon pokemon, PokemonState s) {
		pokemon.evolve(s);
	}

}
