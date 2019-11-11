package Tehtava6;

public class Main {

	public static void main(String[] args) {
		Pizza Hawaji = new Ham(new Pineapple(new Cheese(new Sauce(new PizzaCrust()))));
		Pizza Bolognese = new Cheese(new Bolognese(new Sauce(new PizzaCrust())));
		Pizza Dillinger = new Salami(new Ham(new Bolognese(new Onion(new Cheese(new Sauce(new PizzaCrust()))))));
		
		System.out.println("Menu:");
		System.out.println("\nHawaji pizza: \nIngredients: " + Hawaji.getDescription() + "\nPrice: " + Hawaji.getPrice()+ "e");
		System.out.println("\nBolognese pizza: \nIngredients: " + Bolognese.getDescription() + "\nPrice: " + Bolognese.getPrice()+ "e");
		System.out.println("\nDillinger pizza: \nIngredients: " + Dillinger.getDescription() + "\nPrice: " + Dillinger.getPrice() + "e");
	}

}
