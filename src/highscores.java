
public class highscores {
	public static void main(String[] args) {
		String[] highscores = new String[5];
		initHighscores(highscores);
		insertScore(highscores, "Ian -100");
		displayScores(highscores);
		
	}

	public static String[] initHighscores(String[] highscores) {
		for (int i = 0; i < highscores.length; i++) {
			highscores[i] = "No Name -0";
		}
		return highscores;
	}
public static void displayScores(String[]highscores){
	for (int i = 0; i < highscores.length; i++) {
		System.out.println(highscores[i]);
	}
	
}
	public static String[] insertScore(String[] highscores, String scoreName) {
		for (String b : highscores) {
			String[] splitResult = b.split("-");
			int score = Integer.parseInt(splitResult[1]);
			for (int i = 0; i < splitResult.length; i++) {

				if (score < Integer.parseInt(splitResult[1])) {

				}
				else{
					highscores [i] = splitResult [0] + "-" + Integer.parseInt(splitResult[1]);
				}
			}
		}
		return highscores;
	}

}
