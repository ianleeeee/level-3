import java.util.Stack;

public class jan13 {
	public static void main(String[] args) {
		int[] input = new int[]{3,7,5,2,1};
		System.out.println("warm-up 1:");
		for (int x:reverse(input)) {
			System.out.print(x);
		}
		System.out.println();
		int[] start = new int[]{1,3,7};
		int[] end = new int[]{5,2,3};
		System.out.println("warm-up 2:");
		for (int i : append(start,end)) {
			System.out.print(i);
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
		int[]fin = new int[(start.length+end.length)];
		for (int i = 0; i < start.length; i++) {
			fin[i] = start[i];
		}
		for (int i = 0; i < end.length; i++) {
			fin[i+(start.length)] = end[i];
		}
		return fin;
	}
}
