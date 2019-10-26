package Tehtava2;


public class Main {
	public static void main(String[] args) {
		
		AbstractFactory factory = new AdidasFacory();
        Person jasper = new Person();
        jasper.pue(factory);
        
        factory = new BossFactory();
        jasper.pue(factory);
    }

}
