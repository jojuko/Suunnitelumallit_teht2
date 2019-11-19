package Tehtava11;

import java.util.Random;

public class Main {
	static int i;
	
	public static void main(String[] args) throws InterruptedException {
		
		Player player = new Player();
		Riddler edwardNigma = new Riddler();
		
		Runnable game = new Runnable(){
			@Override
			public void run() {
				player.joinGame(edwardNigma);
				boolean truth = false;
				while(!truth) {
					Random rand = new Random();
					int guess = rand.nextInt(10)+1;
					truth = player.check(edwardNigma, guess);
					if(truth == false) {
						System.out.println("Player"+ i + " guessed, " + guess + " wrong!");
					}
					else {
						System.out.println("Player"+ i + " guessed, " + guess + " right!");
					}
				}
			}
		};
		
		for(i = 1 ; i < 4 ; i++) {
			new Thread(game).start();
			Thread.sleep(100);
		}
	}

}


