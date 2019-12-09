package Teht22;

public class Button {
	private Command cmd;
	
	public Button(Command cmd) {
		this.cmd = cmd;
	}
	
	public void push() {
		cmd.execute();
	}

}
