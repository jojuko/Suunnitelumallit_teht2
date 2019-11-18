package Tehtava10;

public class Manager extends Handler{

	@Override
	public void process(Raise raise) {
		if((raise.getSalary() * 1.05) >= raise.getRaise() && (raise.getSalary()* 1.02) < raise.getRaise()) {
			System.out.println("Your manager will handle the raise of 5% or under: " + raise.getRaise()  + "e");
		}
		else {
			successor.process(raise);
		}
		
		
	}

}
