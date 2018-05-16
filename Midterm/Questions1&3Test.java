import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;


class MidtermTest {

	@Test
	void testMaxOccurences() {
		// create object of Assignment Class to test
		Midterm m = new Midterm();
		
		// create HashMap to test for duplicates, put in duplicate to test removal
		List<Integer> test = new LinkedList<Integer>();
		assertEquals(0,test.size()); //check for list size
		test.add(9);
		test.add(6);
		test.add(9);
		test.add(1);
		test.add(-2);
		test.add(9);
		assertEquals(6,test.size()); //check for list size
		
		// create object testing method
		// test for size, should return false since "Reges" value is duplicate
		// print to test as well
		int result = m.maxOccurences(test);
		assertEquals(3,result);
		System.out.println(result);
	}
	
	@Test
	void testMatchDigits() {
		Midterm m2 = new Midterm();
		
		int num1 = 123456;
		int num2 = 123556;
		
		int result = m2.digitMatch(num1, num2);
		assertEquals(5, result);
		System.out.println(result);
	}

}
