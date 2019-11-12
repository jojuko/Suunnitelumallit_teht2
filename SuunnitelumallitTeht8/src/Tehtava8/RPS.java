package Tehtava8;

import java.util.Scanner;

public class RPS extends Game{
	static Scanner sc = new Scanner(System.in);
	String choice, player2;
	int pick;

	@Override
	void initializeGame() {
		System.out.println("Welcome to play Rock, Paper Scissors!");		
	}

	@Override
	void makePlay(int player) {
		boolean truth = false;
		if(player == 1) {
			while(!truth) {
				System.out.println("Choose one 1: Rock, 2:Paper, 3:Scissors");
				String answer = sc.nextLine();
				switch(answer) {
				case "1" :
		            choice = "Rock";
		            truth = true;
		            break;
		         case "2" :
		             choice = "Paper";
		             truth = true;
		            break;
		         case "3" :
		            choice = "Scissors";
		            truth = true;
		            break;
		         default:
		        	 System.out.println("Unknown command");
				}
			}pick ++;	
		}
		else{
			int random = (int )(Math.random() * 3 + 1);
			if(random == 1) {
				player2 = "Rock";
			}else if(random == 2){
				player2 = "Paper";
			}else {
				player2 = "Scissors";
			}
			pick ++;
		}
		endOfGame();
	}

	@Override
	boolean endOfGame() {
		boolean end = false;
		if(pick == 2) {
			end = true;
		}
		return end;
	}

	@Override
	void printWinner() {
		if(choice.equals("Rock") && player2.equals("Scissors")) {
			System.out.println("You win! Opponent picked: " + player2);
		}
		else if (choice.equals("Paper") && player2.equals("Rock")) {
			System.out.println("You win! Opponent picked: " + player2);
		}
		else if(choice.equals("Scissors") && player2.equals("Paper")) {
			System.out.println("You win! Opponent picked: " + player2);
		}
		else if(choice.equals(player2)) {
			System.out.println("It's a draw! Opponent picked: " + player2);
		}
		else {
			System.out.println("You lose! Opponent picked: " + player2);
		}
		
	}

}
