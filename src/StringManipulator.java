import static org.junit.Assert.*;

import org.junit.Test;

public class StringManipulator {
	@Test
	public void testStringManipulator(){
		StringManipulator sm = new StringManipulator();
		assertEquals("sdrawkcab", sm.reverseWord("backwards"));
		assertEquals("CAPITAL", sm.capitalizeWord("capital"));
		assertEquals("lower case", sm.uncapitalizeWord("LoWer CAsE"));
	}

	private Object uncapitalizeWord(String string) {
		// TODO Auto-generated method stub
		return string.toLowerCase();
		
	}

	private Object capitalizeWord(String string) {
		// TODO Auto-generated method stub
		return string.toUpperCase();
	}

	private Object reverseWord(String string) {
		// TODO Auto-generated method stub
		String word = "";
		for (int i = string.length() -1; i > -1 ; i--) {
			word+=string.charAt(i);
		}
		return word;
	}

}
