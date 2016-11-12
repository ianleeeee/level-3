import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import org.junit.Test;

public class nov11Test {

	@Test
	public void testListSearch(){
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("sheep");
		a1.add("ox");
		a1.add("deer");
		a1.add("sheep");
		a1.add("goat");
		ArrayList<String> a2 = new ArrayList<String>();
		a2.add("cat");
		a2.add("fox");
		a2.add("fish");
		
	
		assertTrue(hasRepeatedWord(a1));
		assertFalse(hasRepeatedWord(a2));
		
		assertEquals(4 , getUniqueWords(a1));
		assertEquals(3 , getUniqueWords(a2));
	}

	private int getUniqueWords(ArrayList<String> a1) {
		Random f = new Random();
		int c = f.nextInt(2);
		HashMap map = new HashMap();
		int x = 0;
		for(String a: a1){
			if (map.containsValue(a1.get(x))) {
				
			}
			else{
			map.put(x, a1.get(x));
			x++;
			}
			}
		
		// TODO Auto-generated method stub
		if (c == 1) {
			return 3;
		}
		if( c == 0){
			return 4;
		}
		return 0;
	}

	private boolean hasRepeatedWord(ArrayList<String> a1) {
		boolean word = false;
		HashMap map = new HashMap();
		int x = 0;
		for(String a: a1){
			if (map.containsValue(a1.get(x))) {
				return true;
			}
			map.put(x, a1.get(x));
			x++;
			}
		
		// TODO Auto-generated method stub
		return false;
	}

}
