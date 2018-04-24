package chapter11;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class Assignment3 {
	
	public boolean isUnique(Map<String,String> map) {
		
		// create a hash set of Map parameter to eliminate duplicates if there are any
		Set<String> values = new HashSet<String>(map.values());
		
		// test to see if duplicate have been removed by comparing length of map/set
		if (map.size() == values.size()) {
			// return true if no duplicates
			return true;
		}else {
			// return false if duplicates are present and removed
			return false;
		}
	}

}
