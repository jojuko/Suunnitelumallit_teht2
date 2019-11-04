package Tehtava5;

import java.util.*;

public class DeckFactory {
	private volatile static DeckFactory instance = null;
	
	private static String[] cards = {"Pata A", "Pata K", "Pata Q", "Pata J", "Pata 10", "Pata 9", "Pata 8", "Pata 7", "Pata 6", "Pata 5", "Pata 4", "Pata 3", "Pata 2", 
			"Risti A", "Risti K", "Risti Q", "Risti J", "Risti 10", "Risti 9", "Risti 8", "Risti 7", "Risti 6", "Risti 5", "Risti 4", "Risti 3", "Risti 2", 
			"Hertta A", "Hertta K", "Hertta Q", "Hertta J", "Hertta 10", "Hertta 9", "Hertta 8", "Hertta 7", "Hertta 6", "Hertta 5", "Hertta 4", "Hertta 3", "Hertta 2",
			"Ruutu A", "Ruutu K", "Ruutu Q", "Ruutu J", "Ruutu 10", "Ruutu 9", "Ruutu 8", "Ruutu 7", "Ruutu 6", "Ruutu 5", "Ruutu 4", "Ruutu 3", "Ruutu 2" };
	
	private LinkedList<String> deckofcards = new LinkedList<String> (Arrays.asList(cards));
	
	private DeckFactory() {
	}
	
	public static DeckFactory getInstance() {
		if(instance == null) {
			synchronized(DeckFactory.class) {
				if(instance == null) {
					instance = new DeckFactory();
					Collections.shuffle(instance.deckofcards);
				}
				
			}
		}	
		return instance;
	}
	
	public LinkedList<String> getDeck(){
		return instance.deckofcards;
	}
	
	public LinkedList<String> getCards(){
		LinkedList<String> cards = new LinkedList<String>();
		for(int i = 0; i < 5; i++){
			cards.add(instance.deckofcards.remove(0));	
		}
		return cards;	
	}
	
	public void returnCards(LinkedList<String> cards) {
		instance.deckofcards.addAll(cards);
	}
	

}
