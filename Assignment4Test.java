import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


import org.junit.jupiter.api.Test;
class Assignment4Test {

	@Test
	void testWriteSequence() {
		Assignment4 test = new Assignment4();
		
		//test for correct output
	    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(outContent));
	    
	    // print to console to be captured by PrintStream
		test.writeSequence(5);
		
		
		// get expected output
		String expOutput = "3 2 1 2 3 ";
		
		// test expected output vs print to console
		assertEquals(outContent.toString(),expOutput);
	}
	
	@Test
	void testWriteSequence1() {
		Assignment4 test = new Assignment4();
		
		//test for correct output
	    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(outContent));
	    
	    // print to console to be captured by PrintStream
		test.writeSequence(7);
		
		
		// get expected output
		String expOutput = "4 3 2 1 2 3 4 ";
		
		// test expected output vs print to console
		assertEquals(outContent.toString(),expOutput);
	
	}
		
	@Test 
	void testIllegalArugmentException(){
		Assignment4 test1 = new Assignment4();
	
		//test for illegal argument exception
		assertThrows(IllegalArgumentException.class,
				()->{test1.writeSequence(0);});
		
		assertThrows(IllegalArgumentException.class,
				()->{test1.writeSequence(-1);});
		
	}

}
