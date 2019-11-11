package Tehtava6;

public class Onion extends Topping{

	public Onion(Pizza newPizza) {
		super(newPizza);
	}
	
	public String getDescription() {
		return newPizza.getDescription() + ", Onion";
	}
	
	public double getPrice() {
		return newPizza.getPrice() + 0.25;
	}

}
