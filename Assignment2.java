package chapter11;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Assignment2 {


	public LinkedList<Integer> partition(List<Integer> list, int E) {
		
		// create LinkedList to be sorted into LinkedLists above and below E
		LinkedList<Integer> sorted = new LinkedList<Integer>();

		// Create iterator
		Iterator<Integer> itr = list.iterator();

		// iterate through LinkedList and sort numbers below and above E
		while (itr.hasNext()) {
			
			int i = itr.next();
			if (i < E) {
				sorted.addFirst(i); // sort numbers below E. Add to beginning of set

			} else if (i > E) {
				sorted.addLast(i); // sort numbers above E. Add to end of set
			}
		}

		// return LinkedList with combined results
		return sorted;

	}

}
