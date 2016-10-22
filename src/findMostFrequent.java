import java.util.HashMap;

public class findMostFrequent {
	static int result;
	public static void main(String[] args) {
		int[] list = {0,1,1,2,5,3,3,0,0,0,1};
		int[]list2 = {1,1,1,4,3,4,2,4,2,1,0};
		int[] list3 = {};
		findFrequent(list);
		findFrequent(list2);
		findFrequent(list3);
	}


	public static void findFrequent(int[] list) {
		int highest = 0;
		
		int len = list.length;
		if (len == 0) {
			System.out.println("Empty list! No numbers occurred");
			return;
		}
		HashMap<Integer, Integer> map = new HashMap();
		for (int i = 0; i < len; i++) {
			int num = list[i];
			if (map.containsKey(num)) {
				int y=(int) map.get(num);
				map.put(num,y+1);
			}
			else
			map.put(num, 1);
			
		}
		for (Integer key: map.keySet()) {
			if ((int)map.get(key) > highest) {
				highest = (int)map.get(key);
				result = key;
			}
		}
		System.out.println("The number that occured most frequently is "+result);
	}
}
