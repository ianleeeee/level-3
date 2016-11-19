import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class hangman {
	static String [] words = new String[10];
	static String correctWordString;
	public static int lives = 10;
	public static void main(String[] args) {
		words[0] = "chocolate";
		words [1] = "hoax";
		words [2] = "computer";
		words[3] = "jazz";
		words[4] = "question";
		words[5] = "conundrum";
		words [6] = "turtle";
		words [7] = "tyranical";
		words[8] = "keyboard";
		words[9] = "black";
		Random rand = new Random();
		int randWord = rand.nextInt(10);
		correctWordString = words[randWord];
		System.out.println("Welcome to hangman");
		System.out.println("Guess individual letters, good luck!");
		game();
	}

	public static void game() {
		char[] correctWord = correctWordString.toCharArray();
		String c = correctWordString;
		char[] blanks = c.toCharArray();
		for (int i = 0; i < correctWord.length; i++) {
			blanks[i] = '_';
		}
		System.out.println("The current word is: " + new String(blanks));
		boolean inGame = true;
		Scanner scan = new Scanner(System.in);
		while (inGame = true) {
			System.out.println("Guess a letter: ");
			System.out.println();
			System.out.println("The current word is: " + new String(blanks));

			String guess1 = scan.next();
			char guess = guess1.charAt(0);
			// System.out.println(guess);
			boolean correct = false;
			for (int i = 0; i < correctWord.length; i++) {
				if (guess == correctWord[i]) {
					blanks[i] = guess;
					
					System.out.println("Correct! " + lives + " lives left.");
					System.out.println();
					System.out.println("The current word is: " + new String(blanks));
					correct = true;
					if (Arrays.equals(blanks, correctWord)) {
						System.out.println("You win!");
						inGame = false;
						System.exit(0);
					}
					

				}}
				if (correct != true) {
					//System.out.println("running");
					System.err.println("Nope, -1 life");
					System.out.println("The current word is: " + new String(blanks));
					lives--;
					System.err.println("You have " + lives + " lives.");
					if (lives <= 0) {
						System.err.println("You lose! No more lives!");
						System.out.println("The word was: "+ correctWordString);
						inGame = false;
						System.exit(0);
					}
				
			}
		}
	}

}
