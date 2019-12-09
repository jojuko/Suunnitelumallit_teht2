package Teht22;

public class PushDown implements Command{
	private Canvas canvas;
	
	public PushDown(Canvas canvas) {
		this.canvas = canvas;
	}

	@Override
	public void execute() {
		canvas.rollDown();
		
	}

}
