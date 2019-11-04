package Tehtava5;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		DeckFactory player1 = DeckFactory.getInstance();
		
		System.out.println(player1.getDeck());
		LinkedList<String> firsthand = player1.getCards();
		System.out.println("Ensimmäisen pelaajan käsi: " + firsthand +  "\n");
		
		DeckFactory player2 = DeckFactory.getInstance();
		System.out.println(player2.getDeck());
		LinkedList<String> secondhand = player2.getCards();
		
		System.out.println("Toisen pelaajan käsi: " + secondhand);
		
		player1.returnCards(firsthand);
		player2.returnCards(secondhand);
		System.out.println(player1.getDeck());
		

	}

}
