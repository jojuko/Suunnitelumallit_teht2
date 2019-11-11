package Tehtava6;

public class PizzaCrust implements Pizza{

	@Override
	public String getDescription() {
		return "Dough";
	}

	@Override
	public double getPrice() {
		return 5;
	}

}
