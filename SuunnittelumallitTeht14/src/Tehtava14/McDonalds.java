package Tehtava14;

import java.util.*;

public class McDonalds extends BurgerBuilder{
	private List<Elements> burger;
	
	
	@Override
	public Object getBurger() {
		return burger;
	}

	@Override
	public void createBurger() {
		burger = new ArrayList<Elements>();
		
	}

	@Override
	public void buildSampyla() {
		burger.add(new Sampyla("Sämpylä"));
		
	}

	@Override
	public void buildPihvi() {
		burger.add(new Pihvi("Riistomaassa valmistettu pihvi"));
		
	}

	@Override
	public void buildJuusto() {
		burger.add(new Juusto("Cheddarjuusto"));
	}

	@Override
	public void buildSalaatti() {
		burger.add(new Salaatti("Jäävuorisalaatti"));
		
	}

	@Override
	public void buildKastite() {
		burger.add(new Kastike("McFeast majoneesi"));
		
	}

}
