package JavaEnterPriseEdition;
import java.util.Scanner;

class Guesser{
	int guessNum;
	public int guessNumber(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Guesser Kindly guess a number");
		guessNum = scan.nextInt();
		return guessNum;
	}
}

class Player1{
	int pguessNum;
	
	int guessnumber(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Player 1 kindly guess the number");
		pguessNum = scan.nextInt();
		return pguessNum;
	}
}

class Player2{
	int pguessNum;
	
	int guessnumber(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Player 2 kindly guess the number");
		pguessNum = scan.nextInt();
		return pguessNum;
	}
}
class Player3{
	int pguessNum;
	
	int guessnumber(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Player 3 kindly guess the number");
		pguessNum = scan.nextInt();
		return pguessNum;
	}
}

class Umpire{
	
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	void collectNumFromGuesser(){
		Guesser g = new Guesser();
		numFromGuesser = g.guessNumber();
	}
	
	void collectNumFromPlayer() {
		Player1 p1 = new Player1();
		Player2 p2 = new Player2();
		Player3 p3 = new Player3();
		numFromPlayer1 = p1.guessnumber();
		numFromPlayer2 = p2.guessnumber();
		numFromPlayer3 = p3.guessnumber();
	}
	
	void compare(){
		if(numFromGuesser==numFromPlayer1) {
			if(numFromGuesser==numFromPlayer2&&numFromGuesser==numFromPlayer3) {
				System.out.println("Game tied all three player guess the right number");
			}else if(numFromGuesser == numFromPlayer2) {
				System.out.println("Both player 1 and 2 won the game");
			}else if(numFromGuesser == numFromPlayer3) {
				System.out.println("Both player 1 and 3 won the game");
			}else {
			System.out.println("Player 1 won the game");
			}
		}else if(numFromGuesser==numFromPlayer2) {
			if(numFromGuesser == numFromPlayer3) {
				System.out.println("Player 2 and 3 won the game");
			}else {
			System.out.println("Player 2 won the game");
			}
		}else if(numFromGuesser==numFromPlayer3){
			System.out.println("Player 3 won the game");
		}else 
		{
			System.out.println("No player doesn't guess the right number ;");
		}
	}
}

public class GuesserGame {
	public static void main(String[] args) {
		Umpire u = new Umpire();
		u.collectNumFromGuesser();
		u.collectNumFromPlayer();
		u.compare();
	}
}