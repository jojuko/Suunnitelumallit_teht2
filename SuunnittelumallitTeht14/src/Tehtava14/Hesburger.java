package Tehtava14;

public class Hesburger extends BurgerBuilder{
	private StringBuilder burger;

	@Override
	public Object getBurger() {
		return burger;
	}

	@Override
	public void createBurger() {
		burger = new StringBuilder();
		
	}

	@Override
	public void buildSampyla() {
		burger.append("Sämpylä, ");
		
	}

	@Override
	public void buildPihvi() {
		burger.append("Kotimainen pihvi, ");
		
	}

	@Override
	public void buildJuusto() {
		burger.append("Cheddarjuusto, ");
		
	}

	@Override
	public void buildSalaatti() {
		burger.append("Vihreä salaatti, ");
		
	}

	@Override
	public void buildKastite() {
		burger.append("Hesen majoneesi ");
		
	}
}
