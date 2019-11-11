package Tehtava6;

public class Ham extends Topping{

	public Ham(Pizza newPizza) {
		super(newPizza);
	}
	
	public String getDescription() {
		return newPizza.getDescription() + ", Ham";
	}
	
	public double getPrice() {
		return newPizza.getPrice() + 1.05;
	}
	

}
