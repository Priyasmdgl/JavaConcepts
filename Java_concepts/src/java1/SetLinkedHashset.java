package java1;

import java.util.LinkedHashSet;

public class SetLinkedHashset {
	public void linkedhashset() {
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		//insertion
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		System.out.println(set);
		//deletion
		System.out.println(set.remove(3));
		System.out.println(set);
		//contains
		System.out.println(set.contains(5));
		//size
		System.out.println(set.size());
		//is empty
		System.out.println(set.isEmpty());
		//iterator
		for (Integer integer : set) {
			System.out.println(integer);
		}
		//clear
		set.clear();
		System.out.println(set);
	}

	public static void main(String[] args) {
		SetLinkedHashset set = new SetLinkedHashset();
		set.linkedhashset();
	}

}
