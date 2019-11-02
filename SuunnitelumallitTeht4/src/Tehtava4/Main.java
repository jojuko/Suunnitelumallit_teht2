package Tehtava4;

public class Main {

	public static void main(String[] args) {
		ClockTimer timer = new ClockTimer(14, 45 ,0);
		DigitalClock clock = new DigitalClock(timer);
		
		new Thread(timer).start();

	}

}