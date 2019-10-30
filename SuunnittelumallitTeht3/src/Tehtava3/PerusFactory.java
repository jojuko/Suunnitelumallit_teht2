package Tehtava3;

public class PerusFactory extends AbstractFactory {
	
	@Override
	public Laiteosa makeKoppa() {
		Laiteosa koppa = new Komponentit("Koppa", 80);
		return koppa;
	}
	
	@Override
	public Laiteosa makeEmolevy() {
		Laiteosa emo = new Komponentit("Emolevy", 100);
		return emo;
	}
	
	@Override
	public Laiteosa makeProssu() {
		Laiteosa prossu = new Komponentit("Prossu", 100);
		return prossu;
	}
	
	@Override
	public Laiteosa makeNayttis() {
		Laiteosa nayttis = new Komponentit("Näytönohjain", 100);
		return nayttis;
	}
	
	@Override
	public Laiteosa makeRam() {
		Laiteosa ram = new Komponentit("RAM", 100);
		return ram;
	}
	
	@Override
	public Laiteosa makeVerkko() {
		Laiteosa verkko = new Komponentit("Verkkokortti", 100);
		return verkko;
	}

	@Override
	public Laiteosa makeTietokone() {
		Laiteosa kone = new Komponentit("Hp:n peruskone:", 0);
		return kone;
	}

}

