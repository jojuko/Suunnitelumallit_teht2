package Tehtava2;

public class Person {
	
	public void pue(AbstractFactory factory) {
		Cap cap = factory.createCap();
		Shirt shirt = factory.createShirt();
		Shoe shoe = factory.createShoe();
		Pants pants = factory.createPants();
		System.out.println("Jasper vaatetus on " + cap + ", " + shirt + ", " + pants + " ja " + shoe);
		
	}

}
