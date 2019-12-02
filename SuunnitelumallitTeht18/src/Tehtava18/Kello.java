package Tehtava18;

public class Kello implements Cloneable{
	private SekunttiViisari s;
	private TuntiViisari h;
	private MinuuttiViisari m;
	
	public Kello(){
		s = new SekunttiViisari();
		m = new MinuuttiViisari();
		h = new TuntiViisari();
	}
	
	public void setAika(int hour, int min, int sec) {
		s.setSec(sec);
		m.setMin(min);
		h.setHour(hour);
	}
	
	public void tick() {
		s.setSec(s.getSec() + 1);
		if(s.getSec() == 60) {
			s.setSec(0);
			m.setMin(m.getMin() + 1);
			if(m.getMin() == 60) {
				m.setMin(0);
				h.setHour(h.getHour() + 1);
				if(h.getHour() == 24) {
					h.setHour(0);
				}
			}
		}
		printAika();
	}
	
	public void printAika() {
		System.out.println("Kello on: " + h.getHour() + ":" + m.getMin() + ":" + s.getSec());
	}
	
	public Kello clone() {
		Kello clock = null;
		try {
			clock = (Kello)super.clone();
			clock.s = (SekunttiViisari)s.clone();
			clock.m = (MinuuttiViisari)m.clone();
			clock.h = (TuntiViisari)h.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clock;
	}


}
