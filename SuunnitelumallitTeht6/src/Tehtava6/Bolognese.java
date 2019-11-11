package Tehtava6;

public class Bolognese extends Topping{

	public Bolognese(Pizza newPizza) {
		super(newPizza);
	}
	
	public String getDescription() {
		return newPizza.getDescription() + ", Bolognese sauce";
	}
	
	public double getPrice() {
		return newPizza.getPrice() + 1.50;
	}

}
