package Assignment2;

import java.util.Scanner;

class Guesser {
	int guessNum;
	
	public int guessNumber()
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Guesser kindly guess the number");
		guessNum=scan.nextInt(); // 1- the input from terminal and store it in guessNum variable
		return guessNum; // 2- after storing the number, he has to give it to umpire
	}
	
	// 3- we also have players.  All palyers perform the same activity, so I will crate only 1 payer class, then create multiple objects/instances.
	// players perform the act of guessing, 
}

class Player {
	int playerGuessNum;
	
	int guessNumber()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Player kindly guess the number");
		
		playerGuessNum = scan.nextInt(); //4- the number that player has guessed will be stored in this variable
		return playerGuessNum; // 5- player has to return the number to the Umpire
	}
}


class Umpire {
	
	int numFromGuesser;		// 6- umpire stores the number from guesser
	int numFromPlayer1;		// 7- umpire gets number from player 1
	int numFromPlayer2;
	int numFromPlayer3;
	
	public void collectNumFromGuesser() //8- Umpire collect number from Guesser
	{
		Guesser g = new Guesser(); //9- create object of calss
		numFromGuesser = g.guessNumber(); //10- store whatever number the guesser guesses in varialbe
	}
										// 11- first work of umpire is over
	
	
	void collectNumFromPlayer()
	{
		Player p1 = new Player(); // 12- umpire collect numbers from all palyers, so we have to crete player object
		Player p2 = new Player();
		Player p3 = new Player();

		numFromPlayer1= p1.guessNumber(); // 13- player 1 will guess the number and return, so store it in variable
		numFromPlayer2= p2.guessNumber();
		numFromPlayer3= p3.guessNumber();
	}
										// 13- first work of umpire is over
	
	void compare ()   // 3rd work of umpire is to do the comparrison
	{
		if(numFromGuesser == numFromPlayer1)
		{
			System.out.println("Player 1 won the game!!");
		}
		
		else if(numFromGuesser == numFromPlayer2)
		{
			System.out.println("Player 2 won the game!!");
		}
		
		else if (numFromGuesser == numFromPlayer3)
		{
			System.out.println("Player 3 won the game!!");
		}
		
		else 
		{
			System.out.println("Game is lost!! tray to play it again-)");
		}
		
		
	}
}


public class GuesserGame {

	public static void main(String[] args) {
		
		Umpire u = new Umpire(); // crate Umpire object
		u.collectNumFromGuesser(); // umpire collect number from guesser
		u.collectNumFromPlayer(); // umpire collect number from player
		u.compare(); // umpire compares the numbers
	}

}
// what if multiple people guepss the crrect number?
// you get the same message, "player kindly guess the number", I want multiple messges, for this yu have to create multiple class
