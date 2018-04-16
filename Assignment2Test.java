package chapter11;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Test;

class Assignment2Test {

	@Test
	void testPartition() {
		// Create object of Assignment 2 class to Test
		Assignment2 a = new Assignment2();
		
		// Instantiate E and LinkedList to be passed to partition method
		int E = 5;

		List<Integer> list = new LinkedList<Integer>();
		assertEquals(0,list.size()); //check for list size
		list.add(15);
		list.add(1);
		list.add(6);
		list.add(12);
		list.add(-3);
		list.add(4);
		list.add(8);
		list.add(21);
		list.add(2);
		list.add(30);
		list.add(-1);
		list.add(9);
		assertEquals(12,list.size()); // check for list size after values added

			
		// Pass E and LinkedList through Partition to be sorted
		LinkedList<Integer> result = a.partition(list, E);
		
		// check if LinkedList retains original size after sort and E is not included
		assertEquals(12,list.size());
		assertFalse(result.contains(E));
	
		// make sure LinkedList created from partition method is sorted correctly
		// low makes sure list is sorted below E, high makes sure list is sorted above E
		List<Integer> high = new LinkedList<Integer>();
		List<Integer> low = new LinkedList<Integer>();
		for(int lists:result) {
			if (lists < 5) { 
				low.add(lists); // sort values into list below E
			}
			if (lists > 5) {
				high.add(lists); // sort values into list above E
			}
		}
		
		// make sure size expected for both partitions of list is expected
		assertEquals(7,high.size());
		assertEquals(5,low.size());
			
		
	
	}

}
