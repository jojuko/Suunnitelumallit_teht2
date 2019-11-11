package Tehtava6;

public class Cheese extends Topping{

	public Cheese(Pizza newPizza) {
		super(newPizza);
	}
	
	public String getDescription() {
		return newPizza.getDescription() + ", Mozzarella";
	}
	
	public double getPrice() {
		return newPizza.getPrice() + 0.50;
	}

}
