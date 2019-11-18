package Tehtava10;

public class Ceo extends Handler{

	@Override
	public void process(Raise raise) {
		if((raise.getSalary() * 1.05) < raise.getRaise()) {
			System.out.println("Your CEO will handle the raise of 5% or over: " + raise.getRaise() + "e");
		}
	}

}
