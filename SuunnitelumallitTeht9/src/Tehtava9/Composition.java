package Tehtava9;

import java.util.List;

public class Composition {
	private ListConverter strategy;
	
	public void setStrategy(ListConverter strategy) {
		this.strategy = strategy;
	}
	
	public void printList(List<String> list) {
		System.out.println(strategy.listToString(list));
	}

}
