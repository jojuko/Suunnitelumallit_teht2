package Tehtava6;

public class Salami extends Topping{

	public Salami(Pizza newPizza) {
		super(newPizza);
	}
	
	public String getDescription() {
		return newPizza.getDescription() + ", Salami";
	}
	
	public double getPrice() {
		return newPizza.getPrice() + 1.00;
	}

}
