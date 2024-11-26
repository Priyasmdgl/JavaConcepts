package java1;

import java.util.HashSet;
import java.util.Iterator;

public class SetHashset {
	public void hashset() {
		 HashSet<Integer> set = new HashSet<Integer>();
		//insertion
		 set.add(1);
		 set.add(2);
		 set.add(3);
		 set.add(4);
		 set.add(5);
		 System.out.println(set);
		 //deletion
		 System.out.println(set.remove(2));
		 System.out.println(set);
		 //contains
		 System.out.println(set.contains(5));
		 //size
		 System.out.println(set.size());
		 //is empty
		 System.out.println(set.isEmpty());
		 //retrieving all the elements
		 for (Integer integer : set) {
			System.out.println(integer);
		}
			/*
			 * Iterator<Integer> iterator = set.iterator(); while(iterator.hasNext()) {
			 * System.out.println(iterator.hasNext()); }
			 */
		 //clear
		 set.clear();
		 System.out.println(set);
	}

	public static void main(String[] args) {
		SetHashset set = new SetHashset();
		set.hashset();

	}

}
