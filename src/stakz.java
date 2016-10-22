import java.util.Stack;

public class stakz {public static void main(String[] args) {
	System.out.println(isPalindrome("amanaplanacanalpanama"));
}
public static boolean isPalindrome(String input){

	String result = "";
	char[]c = input.toCharArray();
	Stack s = new Stack();
	
	for (int i = 0; i < c.length; i++) {
		s.push(new Character(c[i]));
	}
	for (int i = 0; i < c.length; i++) {
		result += s.pop();
	}
	if (result .equals(input)) {
		return true;
	}
	else 
		return false;
}
}
