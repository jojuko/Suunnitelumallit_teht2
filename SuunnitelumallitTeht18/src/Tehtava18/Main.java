package Tehtava18;

public class Main {

	public static void main(String[] args) {
		int i = 0;
		Kello kello = new Kello();
		kello.setAika(13, 20, 15);
		
		Kello kloonikello;
		kloonikello = (Kello)kello.clone();
		kloonikello.setAika(15, 59, 55);
		
		while(i < 10) {
			kello.tick();
			kloonikello.tick();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			i ++;
		}
		System.out.println(System.identityHashCode(kello));
		System.out.println(System.identityHashCode(kloonikello));

	}

}
