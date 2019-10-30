package Tehtava3_omatrajapinnat;

public class Nayttis implements Laiteosa{
	
	private String nimi = "näyttis";
	private double hinta = 499.99;

	@Override
	public void addLaiteosa(Laiteosa laiteosa) {
		throw new RuntimeException("Ei voita tehdä");
		
	}

	@Override
	public void printLaiteosa() {
		System.out.println(nimi);
		
	}

	@Override
	public double getHinta() {
		return hinta;
	}

}
