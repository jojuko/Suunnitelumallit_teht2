package Teht22;

public class PushUp implements Command{
private Canvas canvas;
	
	public PushUp(Canvas canvas) {
		this.canvas = canvas;
	}

	@Override
	public void execute() {
		canvas.rollUp();
		
	}

}
