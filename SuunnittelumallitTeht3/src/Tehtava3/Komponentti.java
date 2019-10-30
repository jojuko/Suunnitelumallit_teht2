package Tehtava3;

public class Komponentti implements Laiteosa{
	
	private String nimi;
	private double hinta;
	
	
	public Komponentti(String nimi, double hinta) {
		super();
		this.nimi = nimi;
		this.hinta = hinta;
	}

	
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
