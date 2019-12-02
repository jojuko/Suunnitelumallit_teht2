package Tehtava18;

public class TuntiViisari implements Cloneable {
	
	private int hour;
	
	public TuntiViisari() {
		hour = 0;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}
	
	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
	

}
