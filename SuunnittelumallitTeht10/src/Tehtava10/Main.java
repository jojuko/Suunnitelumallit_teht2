package Tehtava10;

public class Main {

	public static void main(String[] args) {
		Manager manager = new Manager();
		Superior superior = new Superior();
		Ceo ceo = new Ceo();
		manager.setSuccessor(superior);
		superior.setSuccessor(ceo);
		
		Raise raise1 = new Raise(2600);
		Raise raise2 = new Raise(2520);
		Raise raise3 = new Raise(2700);
		
		manager.process(raise1);
		manager.process(raise2);
		manager.process(raise3);

	}

}
