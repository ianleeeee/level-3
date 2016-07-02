import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

public class DinnerDecider {
	public static void main(String[] args) {
		int randomDinner = new Random().nextInt(7);
		ArrayList<String> dinners = new ArrayList<String>();
		dinners.add("Tacos");
		dinners.add("Salmon");
		dinners.add("Hamburgers");
		dinners.add("Pasta");
		dinners.add("Cereal");
		dinners.add("Chicken");
		dinners.add("Macaroni");
		String dinner = dinners.get(randomDinner);
		JOptionPane.showMessageDialog(null, "You should eat "+dinner+" for dinner.");
	}

}
