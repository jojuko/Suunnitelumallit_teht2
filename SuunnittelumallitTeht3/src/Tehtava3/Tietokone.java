package Tehtava3;

public class Tietokone {
	
	
	public void makeTietokone(AbstractFactory tehdas) {
		AbstractFactory factory = tehdas;
		Laiteosa pc = factory.makeTietokone();
		Laiteosa koppa = factory.makeKoppa();
		Laiteosa emo = factory.makeEmolevy();
		Laiteosa nayttis = factory.makeNayttis();
		Laiteosa prossu = factory.makeProssu();
		Laiteosa ram = factory.makeRam();
		Laiteosa verkko = factory.makeVerkko();
		
		pc.addLaiteosa(koppa);
		koppa.addLaiteosa(emo);
		emo.addLaiteosa(nayttis);
		emo.addLaiteosa(prossu);
		emo.addLaiteosa(ram);
		emo.addLaiteosa(verkko);
		
		
		pc.printLaiteosa();
		System.out.println("\nTietokoneen hinta: \n" + pc.getHinta() + "\n");
		
		
	}

}
