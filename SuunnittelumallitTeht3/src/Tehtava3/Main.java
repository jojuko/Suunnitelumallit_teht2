package Tehtava3;

public class Main {

	public static void main(String[] args) {

		AbstractFactory tehdas = new PerusFactory();
		Tietokone uuskone = new Tietokone();
		uuskone.makeTietokone(tehdas);
		
		tehdas= new EdistynytFactory();
		uuskone.makeTietokone(tehdas);

	}

}
