package Tehtava18;

public class MinuuttiViisari implements Cloneable{
	private int min;
	
	public MinuuttiViisari() {
		min = 0;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
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
