package Tehtava14;

public class Tilaus {
	private BurgerBuilder burgerBuilder;
	
	public void setBurgerBuilder(BurgerBuilder bb) {
		this.burgerBuilder = bb;
	}
	
	public Object getBurger() {
		return burgerBuilder.getBurger();
	}
	
	public void constructBurger() {
		burgerBuilder.createBurger();
		burgerBuilder.buildSampyla();
		burgerBuilder.buildPihvi();
		burgerBuilder.buildJuusto();
		burgerBuilder.buildSalaatti();
		burgerBuilder.buildKastite();
	}
	
}
