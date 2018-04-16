package chapter11;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Assignment2 {


	public LinkedList<Integer> partition(List<Integer> list, int E) {
		
		// create two LinkedList to be sorted into LinkedLists above and below E
		LinkedList<Integer> belowE = new LinkedList<Integer>();
		LinkedList<Integer> aboveE = new LinkedList<Integer>();

		// Create iterator
		Iterator<Integer> itr = list.iterator();

		// iterate through LinkedList and sort numbers below and above E
		while (itr.hasNext()) {
			
			int i = itr.next();
			if (i < E) {
				belowE.add(i); // sort numbers below E

			} else if (i > E) {
				aboveE.add(i); // sort numbers above E
			}
		}
		
		// create LinkedList to combine numbers below and above E
		LinkedList<Integer> combined = new LinkedList<Integer>();
		combined.addAll(belowE);
		combined.addAll(aboveE);

		
		// return LinkedList with combined results
		return combined;

	}

}
