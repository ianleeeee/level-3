import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

public class BandNameGenerator {
	public static void main(String[] args) {
		int randomAdj = new Random().nextInt(5);
		int randomNoun = new Random().nextInt(5);
		ArrayList<String> adj = new ArrayList<String>();
		ArrayList<String> noun = new ArrayList<String>();
		adj.add("Kool");
		noun.add("Pigz");
		adj.add("Swag");
		noun.add("Crocodiles");
		adj.add("Hippy");
		noun.add("Forks");
		adj.add("RIPPED");
		noun.add("Tarics");
		adj.add("Depressed");
		noun.add("iPhonez");
		String a = adj.get(randomAdj);
		String n = noun.get(randomNoun);
		JOptionPane.showMessageDialog(null,"Your band name is the " + a +" "+ n);
		
		
		
	}


}
