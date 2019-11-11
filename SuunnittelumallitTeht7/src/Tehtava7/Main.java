package Tehtava7;

public class Main {

	public static void main(String[] args) {
		Pokemon charmander = new Pokemon();
		
		charmander.growl();
		charmander.defend();
		for(int i = 0; i <= 2 ; i++) {
			charmander.attack();
		}
		
		charmander.growl();
		charmander.defend();
		for(int i = 0; i <= 2 ; i++) {
			charmander.attack();
		}
		
		charmander.growl();
		charmander.defend();
		charmander.attack();
	}

}
