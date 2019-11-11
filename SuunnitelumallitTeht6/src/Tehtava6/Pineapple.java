package Tehtava6;

public class Pineapple extends Topping{

	public Pineapple(Pizza newPizza) {
		super(newPizza);
	}
	
	public String getDescription() {
		return newPizza.getDescription() + ", Pineapple";
	}
	
	public double getPrice() {
		return newPizza.getPrice() + 0.70;
	}
	

}
