import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArrayIntListTest {

	@Test
	void testLastIndexOf() {
		ArrayIntList list = new ArrayIntList();
		
		list.add(1);
		list.add(18);
		list.add(2);
		list.add(7);
		list.add(18);
		list.add(39);
		list.add(18);
		list.add(40);
		
		assertEquals(8,list.size());
		assertEquals(-1,list.lastIndexOf(3));
		assertEquals(3,list.lastIndexOf(7));
		assertEquals(5,list.lastIndexOf(39));
		assertEquals(8,list.size());
		
		

	}

	@Test
	void testReplaceAll() {
		ArrayIntList list = new ArrayIntList();
		
		list.add(1);
		list.add(18);
		list.add(2);
		list.add(7);
		list.add(18);
		list.add(39);
		list.add(18);
		list.add(40);
		
		//change all 18 in list
		assertEquals(8,list.size());
		list.replaceAll(18, 42);
		assertEquals(42,list.get(1));
		assertEquals(42,list.get(4));
		assertEquals(42,list.get(6));
		assertEquals(8,list.size());
		
		//change by value not in list, list should not change
		list.replaceAll(5, 50);
		assertEquals(1,list.get(0));
		assertEquals(42,list.get(1));
		assertEquals(2,list.get(2));
		assertEquals(7,list.get(3));
		assertEquals(42,list.get(4));
		assertEquals(39,list.get(5));
		assertEquals(42,list.get(6));
		assertEquals(40,list.get(7));

		
		
		
		
	}

}
