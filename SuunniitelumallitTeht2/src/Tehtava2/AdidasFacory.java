package Tehtava2;

public class AdidasFacory extends AbstractFactory {
	
	@Override
	public Cap createCap() {
		return new AdidasHat();
	}
	
	@Override
	public Pants createPants() {
		return new AdidasPants();
	}
	
	@Override
	public Shirt createShirt() {
		return new AdidasShirt();
	}
	
	@Override
	public Shoe createShoe() {
		return new AdidasShoe();
	}


}
