package Tehtava3_omatrajapinnat;

import java.util.ArrayList;

public class Emolevy implements Laiteosa {
	
	private String nimi = "emolevy";
	private double hinta = 299.99;
	
	ArrayList<Laiteosa> emolevy = new ArrayList<Laiteosa>();


	@Override
	public void addLaiteosa(Laiteosa laiteosa) {
		emolevy.add(laiteosa);
		
	}

	@Override
	public void printLaiteosa() {
		System.out.println(nimi);
		for(Laiteosa komponentti : emolevy) {
			komponentti.printLaiteosa();
		}
			
	}
	
	@Override
	public double getHinta() {
		double total = hinta;
		for(Laiteosa komponentti : emolevy) {
			total += komponentti.getHinta();
		}
		return total;
	}
	

}
