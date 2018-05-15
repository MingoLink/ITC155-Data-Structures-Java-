public int maxOccurrences(List<Integer> list){
    
    HashMap<Integer,Integer> max = new HashMap<Integer,Integer>();
    //iterate through list
    for (int i : list){
        // see if integer is already in list
        if(max.containsKey(i)){
            // set count to previous integer occurrence
            int count = max.get(i);
            //update key/value with integer occurrence count
            max.put(i, count + 1);
        }else{
            // if its not there already place it in map with 1 occurrence
            max.put(i, 1);
        }
    }
    // check for largest int and store in maxInt value
    int maxInt = 0;
    for(int j : max.values()){
        if (j > maxInt){
            maxInt = j;
        }
    }
    return maxInt;
}
