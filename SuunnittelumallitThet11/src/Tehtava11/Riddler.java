package Tehtava11;

import java.util.Random;

public class Riddler {
	
	private int ticket;
	
	public synchronized Object joinGame() {
		Random rand = new Random();
		this.ticket = rand.nextInt(10)+1;
		return new Memento(ticket);
	}
	
	public synchronized  Boolean check(Object object, int guess) {
		Memento memento = (Memento)object;
		if(memento.getTicket() == guess) {
			return true;
		}
		else {
			return false;
		}
	}
	
	private class Memento{
		
		private int ticket;
		
		public Memento(int ticket) {
			this.ticket = ticket;
		}

		public int getTicket() {
			return ticket;
		}
		
	}

}
