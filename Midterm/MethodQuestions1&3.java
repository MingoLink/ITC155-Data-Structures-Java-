import java.util.HashMap;
import java.util.List;
import java.util.Map;
	

public class Midterm{

	public int maxOccurences(List<Integer> list) {
	
		Map<Integer,Integer> max = new HashMap<Integer,Integer>();
	
		//iterate through list
		for(int i : list) {
			//see if integer is already in list
			if(max.containsKey(i)) {
				//set count to previous integer occurrence
				int count = max.get(i);
				max.put(i, count + 1);
			}else {
				//if its not in there place it in map
				max.put(i, 1);
			}
		}
	
		// check for largest int and store in maxInt value
		int maxInt = 0;
		for(int j : max.values()) {
			if (j > maxInt) {
				maxInt = j;
			}
		}
	
		return maxInt;
	}


	public int digitMatch(int num1, int num2) {
		

		// if a or b is less than 0 throw illegal argument exception
	    if (num1 < 0 || num2 < 0) {
	        throw new IllegalArgumentException();
	    
	    // if they are equal to 0 return 1 because they match
	    } else if (num1 == 0 && num2 == 0) {
	        return 1;
	    } else {
	    	//counter for pairs
	        int count = 0;
	        
			// compare last value of number, if match, update counter
	        if (num1 % 10 == num2 % 10) {
	            count++;
	        }
	        
	        //if there are no more number to compare (divide by 10 == 0) 
	        // or go into next recursive call if there is still numbers left
	        if (num1 / 10 == 0 || num2 / 10 == 0) {
	            return count;
	        }
	        //add count to recursive call on method that knocks digit out
	        return count + digitMatch(num1 / 10, num2 / 10);
	    }    
	}
}
