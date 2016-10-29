import java.util.Stack;

public class stakz {public static void main(String[] args) {
	System.out.println(isPalindrome("amanaplanacanalpanama"));
	System.out.println(syntaxChecker("public static void trolll(){"
			+ "syso();}"));
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
public static boolean syntaxChecker(String word){
	char c[] = word.toCharArray();
	int len = c.length;
	Stack s = new Stack();
	for (int i = 0; i < len; i++) {
		if (c[i]=='<' || c[i]== '{' || c[i] == '[') {
			s.push(c[i]);
		}
		else{
			if (c[i] == '}') {
				if (s.isEmpty()) {
					return false;
				}
				char popped =(char) s.pop();
				if (popped=='{') {
					
				}
				else{
					return false;
				}
			}
			if (c[i]=='>') {
				if (s.isEmpty()) {
					return false;
				}
				char popped = (char) s.pop();
				if (popped == '<') {
					
				}
				else{
					return false;
				}
			}
			if (c[i] == ']') {
				if (s.isEmpty()) {
					return false;
				}
				char popped = (char) s.pop();
				if (popped == '[') {
					
				}
				else{
					return false;
				}
			}
			
		}
	}
	return true;

}
}
