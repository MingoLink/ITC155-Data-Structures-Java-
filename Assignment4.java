/**
 * 
 * @author Tom Brady
 * ITC 155 Assignment 4
 *  
 *
 */
public class Assignment4 {

	
	public void writeSequence(int n) {
		// account for client error
	    if (n < 1) {
	        throw new IllegalArgumentException("Please enter a value greater than 0");
	   
	    // base case
	    // if n is odd, print lone 1 in middle of sequence
	    } else if (n == 1) {
	        System.out.print("1 ");
	        
	    // recursive case    
	    } else {
	    	
	    	//prints front of sequence
	    	// integer divison with (n+1) / 2 accounts for correct values for odd and evens
	        System.out.print((n + 1) / 2 + " ");
	        
	        // prints out middle numbers until it reaches 2
	        if (n != 2) {
	            writeSequence(n - 2);
	        }
	        

	        //prints back of sequence
	        //unfolds end sequence after program works out sequence pattern in (n != 2) sequence
	        System.out.print((n + 1) / 2 + " ");
	    }
		
	}
	

}
