package chapter11;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

class Assignment3Test {

	@Test
	void testIsUnique() {
		// create object of Assingment Class to test
		Assignment3 unique = new Assignment3();
		
		// create HashMap to test for duplicates, put in duplicate to test removal
		Map<String,String> test = new HashMap<String,String>();
		assertEquals(0,test.size()); //check for list size
		test.put("Marty","Stepp");
		test.put("Stuart","Reges");
		test.put("Jessica","Miller");
		test.put("Amanda","Camp");
		test.put("Bruce","Reges");
		test.put("Hal","Perkins");
		assertEquals(6,test.size()); //check for list size
		
		// create object testing method
		// test for size, should return false since "Reges" value is duplicate
		// print to test as well
		boolean testIsUnique = unique.isUnique(test);
		assertEquals(false,testIsUnique);
		System.out.println(testIsUnique);
		
	}
	
	@Test
	void testIsUnique1() {
		// create object of Assingment Class to test
		Assignment3 unique = new Assignment3();
		
		// create HashMap to test for duplicates, test no duplicate
		Map<String,String> test = new HashMap<String,String>();
		assertEquals(0,test.size()); //check for list size
		test.put("Marty","Stepp");
		test.put("Stuart","Reges");
		test.put("Jessica","Miller");
		test.put("Amanda","Camp");
		test.put("Bruce","Brady");
		test.put("Hal","Perkins");
		test.put("Brady", "Tom");
		assertEquals(7,test.size()); //check for list size
		
		// create object testing method
		// test for size, should return false since "Reges" value is duplicate
		// print to test as well
		boolean testIsUnique = unique.isUnique(test);
		assertEquals(true,testIsUnique);
		System.out.println(testIsUnique);
		
	}
	

}
