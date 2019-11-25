package Tehtava14;

import java.util.ArrayList;

public class Main {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Tilaus uusTilaus = new Tilaus();
		BurgerBuilder hese = new Hesburger();
		BurgerBuilder mcdonalds = new McDonalds();
		
		uusTilaus.setBurgerBuilder(hese);
		uusTilaus.constructBurger();
		Object hamppari = uusTilaus.getBurger();
		System.out.println("Hesen hamppari sisältää:");
		System.out.println(hamppari);
		
		uusTilaus.setBurgerBuilder(mcdonalds);
		uusTilaus.constructBurger();
		hamppari = uusTilaus.getBurger();
		System.out.println("Mäkkärin hamppari sisältää:");
		for(Elements osa : (ArrayList<Elements>)hamppari) {
			System.out.print(osa.getNimi() + ", ");
		}
	}

}
