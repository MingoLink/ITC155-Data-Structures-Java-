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
