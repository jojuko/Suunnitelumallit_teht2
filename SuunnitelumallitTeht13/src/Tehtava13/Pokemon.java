package Tehtava13;

public class Pokemon {
	
	private PokemonState state;
	private Visitor visitor;
	
	public Pokemon(Visitor v){
		visitor = v;
		state = Charmander.getInstance();
	}
	
	public void attack() {
		state.attack(this, this.visitor);
	}
	
	public void growl() {
		state.growl(this);
	}
	
	public void defend() {
		state.defend(this);
	}
	
	protected void evolve(PokemonState s) {
		state = s;
	}

}
