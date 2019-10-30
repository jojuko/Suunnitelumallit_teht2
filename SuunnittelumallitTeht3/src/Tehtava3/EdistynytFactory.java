package Tehtava3;

public class EdistynytFactory extends AbstractFactory{
	
	@Override
	public Laiteosa makeKoppa() {
		Laiteosa koppa = new Komponentit("Koppa", 150);
		return koppa;
	}
	
	@Override
	public Laiteosa makeEmolevy() {
		Laiteosa emo = new Komponentit("Emolevy", 199.99);
		return emo;
	}
	
	@Override
	public Laiteosa makeProssu() {
		Laiteosa prossu = new Komponentit("Prossu", 299.99);
		return prossu;
	}
	
	@Override
	public Laiteosa makeNayttis() {
		Laiteosa nayttis = new Komponentit("Näytönohjain", 599.99);
		return nayttis;
	}
	
	@Override
	public Laiteosa makeRam() {
		Laiteosa ram = new Komponentit("RAM", 240);
		return ram;
	}
	
	@Override
	public Laiteosa makeVerkko() {
		Laiteosa verkko = new Komponentit("Verkkokortti", 30);
		return verkko;
	}

	@Override
	public Laiteosa makeTietokone() {
		Laiteosa kone = new Komponentit("Hp:n pelikone:", 0);
		return kone;
	}

}
