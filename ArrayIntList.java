
// Class ArrayIntList can be used to store a list of integers.

import java.util.*;

public class ArrayIntList {
    
	public int lastIndexOf(int n) {
		
		//set default index to not found value
		int index = -1;
		
		//if n is not a bad value
		//loop through elementData, if n is found, update index with elementData index
		//last value update for index will be the last index the value is stored
		if(n > 0) {
			
			for(int i = 0; i < size - 1; i++){
				if(elementData[i] == n) {
					index = i;
				}
			}
			return index;
		}
		return index;
	}
	
	public void replaceAll(int orig, int change) {
		
		//precondition
		if(orig > 0 && change > 0) {
			
			//loop through and find value if it exists
			//when value found, change it to value specified by client
			for(int i = 0; i < size; i++) {
				if(elementData[i] == orig) {
					elementData[i] = change;
				}
			}
		}
		
	}
}



