package Tehtava18;

public class SekunttiViisari implements Cloneable{
	private int sec;
	
	public SekunttiViisari() {
		sec = 0;
	}

	public int getSec() {
		return sec;
	}

	public void setSec(int sec) {
		this.sec = sec;
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
