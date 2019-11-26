package Tehtava15;

public class Tank implements UnitMovement{

	@Override
	public void patrol() {
		System.out.println("Tank patrols the area");
		
	}

	@Override
	public void useCannon() {
		System.out.println("Tank shoots the enemy");
		
	}

	@Override
	public void moveForward() {
		System.out.println("Tank is moving forward");
		
	}

}
