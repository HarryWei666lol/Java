package exercises6;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddTest {

	@Test
	public void test() {
		assertEquals(0, Add.addHelper(0, 0));
		for (int i = 0; i < 10; i++) {
			assertEquals(i, Add.addHelper(0, i));
			assertEquals(i, Add.addHelper(i, 0));
		}	
	}
	// write other test cases here:
	// you must put a @test directive before the method
	@Test
	public void test2() {
		for (int i= -100; i < 100; i++) {
			for (int j= -100; j< 200; j++) {
				assertEquals(i+j, Add.add(i, j));
			}
		}
	}
	
	@Test
	public void Special() {
		assertEquals(-2, Add.add(-4, 2));
		assertEquals(-2,Add.add(2, -4));
	}
	
}
