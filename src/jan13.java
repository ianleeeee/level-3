import java.util.Stack;

public class jan13 {
	public static void main(String[] args) {
		int[] input = new int[]{3,7,5,2,1};
		System.out.println("warm-up 1:");
		for (int x:reverse(input)) {
			System.out.print(x);
		}
	}
	public static int[] reverse(int[]input){
		Stack s  = new Stack();
		for (int i = 0; i < input.length; i++) {
			s.push(input[i]);
		}
		for (int i = 0; i < input.length; i++) {
			input[i] = (int) s.pop();
		}
		return input;
	}
	public static int[] append (int[]start, int[]end){
		return start;	
	}
}
