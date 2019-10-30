package Tehtava3_omatrajapinnat;

public class Prosessori implements Laiteosa{
	
	private String nimi = "prossu";
	private double hinta = 399.99;

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
