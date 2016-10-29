
public class numMultiplier { public static void main (String [] args){
	int total = 1;
	int [] nums = {2, 3 ,1,4,3,2};
	int x = nums.length;
	for (int i = 0; i < x; i++) {
		int secNum = nums[i];
		for (int j = 0; j < (x-1); j++) {
			
			total = total * nums[j];
		}
		System.out.println(total);
	}

}}
