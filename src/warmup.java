import static org.junit.Assert.*;

import org.junit.Test;

public class warmup {public static void main(String[] args) {
	
}
	
@Test
public void testMaxFill() {
    int[] expected1 = {1,2,3};
    int[] actual1 = {3,3,3};
    int[] expected2 = {11,5,9};
    int[] actual2 = {11,11,11};
    int[] expected3 = {2,11,3};
    int[] actual3 = {11,11,11};
    methods run = new methods();
	
    assertArrayEquals(run.maxFill(expected1), actual1);
    assertArrayEquals(run.maxFill(expected2), actual2);
    assertArrayEquals(run.maxFill(expected3), actual3);
}





@Test
public void testMixString() {
	methods r = new methods();
    assertEquals(r.mixString("abc", "xyz"), "axbycz");
    assertEquals(r.mixString("Hi", "There"), "HTihere");
    assertEquals(r.mixString("xxxx", "There"), "xTxhxexre");
}


}
