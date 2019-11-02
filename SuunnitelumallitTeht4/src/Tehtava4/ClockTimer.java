package Tehtava4;

import java.util.*;

public class ClockTimer extends Observable implements Runnable{
	private int hour;
	private int minute;
	private int second;


	public ClockTimer(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public int getHour() {
		return hour;
	}
	
	public int getMinute() {
		return minute;
	}
	
	public int getSecond() {
		return second;
	}
	
	public void tick() {
			if(second < 59) {
				second += 1;
			}
			else if(minute < 59) {
				second = 0;
				minute += 1;
			}
			else if(hour < 23) {
				second = 0;
				minute = 0;
				hour += 1;
			}
			else {
				second = 0;
				minute = 0;
				hour = 0;
			}	
	}


	@Override
	public void run() {
		while(true) {
			tick();
			setChanged();
			notifyObservers();
			try {
				Thread.sleep(1000);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
	
	
}
