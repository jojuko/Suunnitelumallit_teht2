package Tehtava10;

public abstract class Handler {
	protected Handler successor;
	
	public void setSuccessor(Handler successor) {
		this.successor = successor;
	}
	
	abstract public void process(Raise raise);
	
}
