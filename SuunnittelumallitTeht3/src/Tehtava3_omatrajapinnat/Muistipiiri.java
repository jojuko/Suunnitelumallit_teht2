package Tehtava3_omatrajapinnat;

public class Muistipiiri implements Laiteosa{
	
	private String nimi = "ram";
	private double hinta = 39.99;
	

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
