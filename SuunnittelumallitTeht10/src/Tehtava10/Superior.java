package Tehtava10;

public class Superior extends Handler{

	@Override
	public void process(Raise raise) {
		if((raise.getSalary() * 1.02) >= raise.getRaise()) {
			System.out.println("Your superior will handle the raise of 2% or under: " + raise.getRaise() + "e");
		}
		else {
			successor.process(raise);
		}
		
	}
	 

}
