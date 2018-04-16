package chapter11;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Assignment2 {

	public static void main(String[] args) {

		int E = 5;

		List<Integer> list = new LinkedList<Integer>();
		list.add(15);
		list.add(1);
		list.add(6);
		list.add(12);
		list.add(-3);
		list.add(4);
		list.add(8);
		list.add(21);
		list.add(2);
		list.add(30);
		list.add(-1);
		list.add(9);

		LinkedList<Integer> sorted = partition(list, E);
		System.out.println(sorted);
	}

	public static LinkedList<Integer> partition(List<Integer> list, int E) {
		
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
