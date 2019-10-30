package Tehtava3_omatrajapinnat;


public class Main {

	public static void main(String[] args) {
		Laiteosa koppa = new Koppa();
		Laiteosa emolevy = new Emolevy();
		
		koppa.addLaiteosa(emolevy);
		emolevy.addLaiteosa(new Prosessori());
		emolevy.addLaiteosa(new Verkkokortti());
		emolevy.addLaiteosa(new Muistipiiri());
		emolevy.addLaiteosa(new Nayttis());
		
		
		Tietokone uuskone = new Tietokone(koppa);
		
		uuskone.getOsat();
		uuskone.koneenHinta();
		

	}

}
