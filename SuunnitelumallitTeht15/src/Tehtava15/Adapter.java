package Tehtava15;

public class Adapter extends Sniper implements UnitMovement {
	private Sniper sniper;
	
	public Adapter(Sniper sniper) {
		this.sniper = sniper;
	}

	@Override
	public void patrol() {
		sniper.scout();
	}

	@Override
	public void useCannon() {
		sniper.shoot();
	}

	@Override
	public void moveForward() {
		sniper.march();
	}

}
