import java.util.Scanner;

public class hangman {
	public static final String correctWordString = "chocolate";
	public static int lives = 10;

	public static void main(String[] args) {
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
		boolean inGame = true;
		Scanner scan = new Scanner(System.in);
		while (inGame = true) {
			System.out.println("Guess: ");
			String guess1 = scan.next();
			char guess = guess1.charAt(0);
			System.out.println(guess);
			boolean correct = false;
			for (int i = 0; i < correctWord.length; i++) {
				if (guess == correctWord[i]) {
					blanks[i] = guess;
					correct = true;
					System.out.println("Correct! " + lives + " lives left.");
					System.out.println(blanks);
					if (blanks == correctWord) {
						System.out.println("You win!");
						inGame = false;
					}
				}
			}
				if (correct = false) {
					System.out.println("running");
					System.out.println("Nope, -1 life");
					lives--;
					System.out.println("You have " + lives + " lives.");
					if (lives <= 0) {
						System.out.println("You lose! No more lives!");
						inGame = false;
					}
				}
			}
		}

	

}
