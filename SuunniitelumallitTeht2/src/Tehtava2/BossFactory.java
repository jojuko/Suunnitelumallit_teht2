package Tehtava2;

public class BossFactory extends AbstractFactory {
	
	@Override
	public Cap createCap() {
		return new BossHat();
	}
	
	@Override
	public Pants createPants() {
		return new BossPants();
	}
	
	@Override
	public Shirt createShirt() {
		return new BossShirt();
	}
	
	@Override
	public Shoe createShoe() {
		return new BossShoe();
	}

}
