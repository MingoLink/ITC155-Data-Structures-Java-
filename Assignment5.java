
public class Assignment5 {

	
	public void writeChars(int n) {
		// if n is less than 1 throw illegal argument exception
		if (n < 1) {
			throw new IllegalArgumentException("Choose something over 0");
		
		// base case 1
		// if n = 1 print star and finish method
		}else if (n == 1) {
			System.out.print("*");
		
		// base case 2
		// if n = 2 print two stars and finish method
		}else if (n == 2) {
			System.out.print("**");
			
		// while n is neither of the base cases since both base cases are less than one..
		// print < arrow, call writeChars, subtract 2 from n until reach base case
		// after you reach base case, > is printed for every time writeChars was called mirroring the < prints
		}else if (n != 2){
			System.out.print("<");
			
			writeChars(n-2);
			
			System.out.print(">");
		}
	}

}
