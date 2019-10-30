package Tehtava3_omatrajapinnat;

public class Verkkokortti implements Laiteosa{
	
	private String nimi = "Verkkokortti";
	private double hinta = 9.95;

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
