
public class warmup1 {
	public static void main(String[] args) {
		int[]input = {0,3,7,8,-10,5,20};
		System.out.println("first:");
		System.out.println(sumOfMinAndMax(input));
		System.out.println();
		System.out.println("second:");
		String one = "turkey";
		String two = "gravy";
		System.out.println(charsInBothWords(one,two));
	}
	public static int sumOfMinAndMax(int [] input){
		int min = -10;
		int max = 0;
		for (int i = 0; i < input.length; i++) {
			if (i < min) {
				min = input[i];
			}
			if (i> max) {
				max = input[i];
			}
		}
		return max + min;
	}
	public static char[] charsInBothWords(String one, String two){
		char[] first = one.toCharArray();
		char [] second = two.toCharArray();
		String similar = "";
		for (int i = 0; i < second.length; i++) {
			char x = second[i];
			for(char c: first){
					if (x == c) {
						similar += x;
					}
				}
			}
		char [] end = similar.toCharArray();
		return end;
	}
}
