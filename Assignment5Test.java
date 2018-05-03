import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

class Assignment5Test {

	@Test
	void testWriteSequence() {
		Assignment5 test = new Assignment5();
		
		//test for correct output
	    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(outContent));
	    
	    // print to console to be captured by PrintStream
		test.writeChars(5);
		
		
		// get expected output
		String expOutput = "<<*>>";
		
		// test expected output vs print to console
		assertEquals(outContent.toString(),expOutput);
	}
	
	@Test
	void testWriteSequence1() {
		Assignment5 test = new Assignment5();
		
		//test for correct output
	    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(outContent));
	    
	    // print to console to be captured by PrintStream
		test.writeChars(6);
		
		
		// get expected output
		String expOutput = "<<**>>";
		
		// test expected output vs print to console
		assertEquals(outContent.toString(),expOutput);
	
	}
		
	@Test 
	void testIllegalArugmentException(){
		Assignment5 test1 = new Assignment5();
	
		//test for illegal argument exception
		assertThrows(IllegalArgumentException.class,
				()->{test1.writeChars(0);});
		
		assertThrows(IllegalArgumentException.class,
				()->{test1.writeChars(-1);});
		
	}

}
