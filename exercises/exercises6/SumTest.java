package exercises6;

import static org.junit.Assert.*;

import org.junit.Test;

public class SumTest {

	@Test
	public void test() {
		assertEquals(0, Sum.sum(0));
		assertEquals(1, Sum.sum(1));
		assertEquals(6,roundtables.Sum.sum(3));
		
		// recall Gauss's finding
		// 1+2+3+...+99+100
		//  n/2 pairs of integers that add to n+1
		for (int i=0; i < 10000; i++ ) {
			int ans = i*(i+1)/2;
			assertEquals(ans, Sum.sum(i));
		}
	}

}
