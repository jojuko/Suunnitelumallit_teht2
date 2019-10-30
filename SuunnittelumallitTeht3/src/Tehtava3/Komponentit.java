package Tehtava3;

import java.util.ArrayList;

public class Komponentit implements Laiteosa{
	
	String nimi;
	double hinta;
	
	ArrayList<Laiteosa> komponentit = new ArrayList<Laiteosa>();
	
	
	public Komponentit(String nimi, double hinta) {
		super();
		this.nimi = nimi;
		this.hinta = hinta;
	}

	@Override
	public void addLaiteosa(Laiteosa laiteosa) {
		komponentit.add(laiteosa);
		
	}

	@Override
	public void printLaiteosa() {
		System.out.println(nimi);
		for(Laiteosa komponentti : komponentit) {
			komponentti.printLaiteosa();
		}
	}

	@Override
	public double getHinta() {
		double total = hinta;
		for(Laiteosa komponentti : komponentit) {
			total += komponentti.getHinta();
		}
		return total;
	}
	
}
