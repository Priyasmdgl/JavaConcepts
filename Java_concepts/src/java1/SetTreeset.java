package java1;

import java.util.TreeSet;

public class SetTreeset {
	public void treeset() {
		TreeSet<Integer> set = new TreeSet<Integer>();
		//insertion
		set.add(1);
		set.add(5);
		set.add(2);
		set.add(6);
		set.add(4);
		System.out.println(set);
		//remove
		System.out.println(set.remove(6));
		System.out.println(set);
		//contains
		System.out.println(set.contains(4));
		//size
		System.out.println(set.size());
		//first lowest element
		System.out.println(set.first());
		//last highest element
		System.out.println(set.last());
		//least element greater than or equal to the specified element
		System.out.println(set.ceiling(5));
		//greatest element less than or equal to the specified element
		System.out.println(set.floor(5));
		//the least element strictly greater than the specified element
		System.out.println(set.higher(2));
		//greatest element strictly less than the specified element
		System.out.println(set.lower(2));
		//value lesser than given value
		System.out.println(set.headSet(4));
		//value equal to or higher than the given value
		System.out.println(set.tailSet(4));
		//subset
		System.out.println(set.subSet(2, 5));
		//comparator which gives the nature of the sorting order
		System.out.println(set.comparator());
		//descending order
		System.out.println(set.descendingSet());
		//pollfirst retrives first element and delete it
		System.out.println(set.pollFirst());
		System.out.println(set);
		//polllast retrives last element and delete it
		System.out.println(set.pollLast());
		System.out.println(set);
		//clear
		set.clear();
		System.out.println(set);
	}

	public static void main(String[] args) {
		SetTreeset set = new SetTreeset();
		set.treeset();

	}

}
