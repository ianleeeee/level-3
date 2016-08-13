import java.util.List;

public class Algorithms {

	public static Object findBrokenEgg(List<String> eggs) {
		// TODO Auto-generated method stub
		int index = 0;
		for(String egg: eggs){
			
			if(egg.contains("cracked")){
				return index;
			}
			index+=1;
		}
		return -1;
	}

	public static Object countPearls(List<Boolean> oysters) {
		// TODO Auto-generated method stub
		int index =0;
		for(Boolean oyster:oysters){
			if(oyster==true){
				return index;
			}
			index+=1;
		}
		return -1;
	}

	public static double findTallest(List<Double> peeps) {
		// TODO Auto-generated method stub
		Double tallest = 0.0;
		for(Double heights: peeps){
			if(heights>tallest){
				tallest = heights;
					}
		}
		return tallest;
	}

	public static Object findLongestWord(List<String> words) {
		// TODO Auto-generated method stub
		String longest = "";
		int longest1 = 0;
		for(String word:words){
			int length = word.length();
			if(length>longest1 ){
				longest1 = length;
				longest = word;
			}
		}
		return longest;
	}

}
