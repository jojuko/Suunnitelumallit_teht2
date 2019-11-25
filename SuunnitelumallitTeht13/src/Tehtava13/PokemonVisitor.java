package Tehtava13;

public class PokemonVisitor implements Visitor{

	@Override
	public void visit(Charmander charmander, Pokemon pokemon) {
		if(charmander.getAttacks() > 2) {
			System.out.println("Charmander evolves into Charmaleon");
			pokemon.evolve(Charmaleon.getInstance());
		}
		else {
			System.out.println("Pokemon needs to attack more for evolution");
		}
	}

	@Override
	public void visit(Charmaleon charmeleon, Pokemon pokemon) { 
		if(charmeleon.getAttacks() > 4) {
			System.out.println("Charmeleon evolves into Charizard");
			pokemon.evolve(Charizard.getInstance());
		}
		else {
			System.out.println("Pokemon needs to attack more for evolution");
		}
		
	}

	@Override
	public void visit(Charizard s, Pokemon pokemon) {
		System.out.println("The final stage");
		
	}

}
