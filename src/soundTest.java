import static org.junit.Assert.*;

import org.junit.Test;

public class soundTest {
	@Test
	public void testSound(){
		Sound s = new Sound(new int[]{40, 2532, 17, -2300, -17, -4000, 2000, 1048, -420, 33,15,-32,2030,3223});
		assertEquals(5, s.limitAmplitude(2000));
		
	}

	
}
