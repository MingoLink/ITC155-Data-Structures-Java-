import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Assignment7Test {

	@Test
	void test() {
		Assignment7 test = new Assignment7();
		
		int[] a = {4, 5, 7, 8, 9, 10, 15, 100, 23, 2};
		
		assertEquals(10,a.length);
		test.selectionSort(a);
		assertEquals(10,a.length);
		
		assertEquals(2,a[0]);
		assertEquals(100,a[9]);

	}
	
	@Test
	void test1() {
		Assignment7 test = new Assignment7();
		
		int[] a = {5, 2, 6, 4, 3, 1000, 1, 20, 1};
		
		assertEquals(9,a.length);
		test.selectionSort(a);
		assertEquals(9,a.length);
		
		assertEquals(1,a[0]);
		assertEquals(1,a[1]);
		assertEquals(2,a[2]);
		assertEquals(1000,a[8]);

	}
	


}
