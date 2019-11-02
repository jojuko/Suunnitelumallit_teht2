package Tehtava4;

import java.util.*;

public class DigitalClock implements Observer{

	private ClockTimer timer;
	
	public DigitalClock(ClockTimer ct) {
		timer = ct;
		timer.addObserver(this);
	}
	
	@Override
	public void update(Observable obs, Object o) {
		if(obs == timer) {
			draw();
		}
	}
	
	private void draw() {
		System.out.println(timer.getHour() + " : " + timer.getMinute() + " : " + timer.getSecond());
	}

	
}
