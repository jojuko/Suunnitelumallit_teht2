package Tehtava11;

public class Player{
	
	private Object player;
	
	public synchronized  void joinGame(Riddler riddler) {
		this.player =riddler.joinGame();
	}
	
	public synchronized  boolean check(Riddler riddler, int guess) {
		return riddler.check(player, guess);
	}
}
