package Tehtava3_omatrajapinnat;

import java.util.ArrayList;


public class Koppa implements Laiteosa{
	
	private String nimi = "koppa";
	private double hinta = 199.99;
	
	ArrayList<Laiteosa> koppa = new ArrayList<Laiteosa>();
	


	@Override
	public void addLaiteosa(Laiteosa laiteosa) {
		koppa.add(laiteosa);
		
	}

	@Override
	public void printLaiteosa() {
		System.out.println(nimi);
		for(Laiteosa komponentti : koppa) {
			komponentti.printLaiteosa();
		}
		
	}

	@Override
	public double getHinta() {
		double total = hinta;
		for(Laiteosa komponentti : koppa) {
			total += komponentti.getHinta();
		}
		return total;
	}
	
}
