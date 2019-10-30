package Tehtava3_omatrajapinnat;

public class Tietokone {
	
	private Laiteosa tietokone;
	
	public Tietokone(Laiteosa uustietokone) {
		this.tietokone = uustietokone;
		}
	
	
	public void getOsat() {
		System.out.println("Uusi tietokone sisältää: ");
		tietokone.printLaiteosa();
	}
	
	public void koneenHinta() {
		System.out.println("\nTietokoneen hinta: \n" + tietokone.getHinta());
	}
	

}
