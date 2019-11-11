package Tehtava6;

public abstract class Topping implements Pizza{
	protected Pizza newPizza;
	
	public Topping(Pizza newPizza) {
		this.newPizza = newPizza;
	}
	
	public String getDescription() {
		return newPizza.getDescription();
	}
	
	public double getPrice() {
		return newPizza.getPrice();
	}

}
