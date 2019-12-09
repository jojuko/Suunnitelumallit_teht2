package Teht22;

public class Main {

	public static void main(String[] args) {
		Canvas canvas = new Canvas();
		Command pushUp = new PushUp(canvas);
		Command pushDown = new PushDown(canvas);
		Button button1 = new Button(pushUp);
		Button button2 = new Button(pushDown);
		
		button1.push();
		button2.push();

	}

}
