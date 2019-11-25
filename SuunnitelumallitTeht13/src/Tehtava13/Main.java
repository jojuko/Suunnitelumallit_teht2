package Tehtava13;

public class Main {

	public static void main(String[] args) {
		Visitor visitor = new PokemonVisitor();
		Pokemon charmander = new Pokemon(visitor);
		
		charmander.growl();
		charmander.defend();
		for(int i = 0; i < 3 ; i++) {
			charmander.attack();
		}
		
		charmander.growl();
		charmander.defend();
		for(int i = 0; i < 6 ; i++) {
			charmander.attack();
		}
		
		charmander.growl();
		charmander.defend();
		charmander.attack();
	}

}
