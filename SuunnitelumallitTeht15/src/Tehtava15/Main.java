package Tehtava15;

public class Main {

	public static void main(String[] args) {
		Tank tiger = new Tank();
		Adapter unit = new Adapter(new Sniper());
		
		tiger.moveForward();
		tiger.patrol();
		tiger.useCannon();
		
		unit.moveForward();
		unit.patrol();
		unit.useCannon();

	}

}
