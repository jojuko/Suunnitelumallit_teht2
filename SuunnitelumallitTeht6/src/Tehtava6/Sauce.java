package Tehtava6;

public class Sauce extends Topping{

	public Sauce(Pizza newPizza) {
		super(newPizza);
	}
	
	public String getDescription() {
		return newPizza.getDescription() + ", Tomato sauce";
	}
	
	public double getPrice() {
		return newPizza.getPrice() + 0.25;
	}
	

}
