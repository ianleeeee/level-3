import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
public class arrayStuffs {
	public static void main(String[] args) {
	testMulByLargest1();
	testMulByLargest2();
}
@Test
public void testMulByLargest1(){
	int[] input1 = {0,1,2,3};
	int[] result1 = {0,3,6,9};
	assertArrayEquals(mulByLargest1(input1),result1);
}
public void testMulByLargest2(){
	ArrayList<Integer> input2 = new ArrayList<Integer>();
	input2.add(0);
	input2.add(1);
	input2.add(2);
	input2.add(3);
	ArrayList<Integer> result2 = new ArrayList<Integer>();
	result2.add(0);
	result2.add(3);
	result2.add(6);
	result2.add(9);
	assertEquals(mulByLargest2(input2),result2);
}

private ArrayList<Integer> mulByLargest2(ArrayList<Integer> input2) {
	int highest = 0;
	for (int i = 0; i < input2.size(); i++) {
		if (input2.get(i) > highest) {
			highest = input2.get(i);
		}
	}
	for (int i = 0; i < input2.size(); i++) {
		input2.set(i, i*highest);
	}
	return input2;
}
private int[] mulByLargest1(int[] input1) {
	int len = input1.length;
	int highest = 0;
	for (int i = 0; i < len; i++) {
		if (input1[i] > highest) {
			highest = input1[i];
		}
		
	}
	for (int i = 0; i < len; i++) {
		input1[i] = input1[i] * highest;
	}
	return input1;
}
}
