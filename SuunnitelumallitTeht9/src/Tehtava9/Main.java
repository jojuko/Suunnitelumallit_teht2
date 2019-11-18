package Tehtava9;

import java.util.*;


public class Main {

	public static void main(String[] args) {
		
		String[] cells = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
		List<String> list = new ArrayList<String>(Arrays.asList(cells));
		
		Composition composition = new Composition();
		
		composition.setStrategy(new IteratorStrategy());
		composition.printList(list);
		
		composition.setStrategy(new GetStrategy());
		composition.printList(list);
		
		composition.setStrategy(new TableStrategy());
		composition.printList(list);
	}

}
