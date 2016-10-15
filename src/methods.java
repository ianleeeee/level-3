import org.junit.experimental.theories.FromDataPoints;

public class methods {
	public int[] maxFill(int[] expected2) {
		int len = expected2.length;
		int highest = 0;
		for (int i = 0; i < len; i++) {
			if (expected2[i]>highest) {
				highest = expected2[i];
			}}
		int[] x = new int[len];
		
		for (int j = 0; j < len; j++) {
			x[j] = highest;
		}
		return x;
	}
	
	public String mixString(String string, String string2) {
		String word = "";
		boolean oneBigTwo = false;
		int len1 = string.length();
		int len2 = string.length();
		if (len1 > len2) {
			oneBigTwo = true;
		}
		if (oneBigTwo) {
			int i = 0;
			for(;i < len1; i++) {
				word +=string2.charAt(i);
				word +=string.charAt(i);
			}
			word +=string.substring(i , len1);
		}
		if(!oneBigTwo){
			int i =0;
		for (; i < len2; i++) {
			word +=string.charAt(i);
			word +=string2.charAt(i);
		}
		word +=string2.substring(i , len2);
		}
		
		
			
		
		return word;
	}

}
