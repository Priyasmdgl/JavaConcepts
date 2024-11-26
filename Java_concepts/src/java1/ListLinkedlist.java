package java1;

import java.util.Iterator;
import java.util.LinkedList;

public class ListLinkedlist {
	public void linkedlist() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		//adding elements to the list
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println(list);
		//adding an element to the first position
		list.addFirst(0);
		System.out.println(list);
		//adding an element to the last position
		list.addLast(6);
		System.out.println(list);
		//retrieve an element
		System.out.println(list.get(1));
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println(list.peek());
		System.out.println(list.peekFirst());
		System.out.println(list.peekLast());
		//removing an element
		System.out.println(list.remove(4));
		System.out.println(list.removeFirst());
		System.out.println(list.removeLast());
		System.out.println(list.removeFirstOccurrence(0));
		System.out.println(list.removeLastOccurrence(6));
		//poll deletes the element
		System.out.println(list.poll());
		System.out.println(list.pollFirst());
		System.out.println(list.pollLast());
		//size of an element
		System.out.println(list.size());
		//iterating elements
		//using for loop
		int i=0;
		for(i=0;i<list.size();i++) {
			System.out.println(list);
		}
		//using foreach loop
		for (Integer integer : list) {
			System.out.println(integer);
		}
		//using iterator
		/*
		 * Iterator<Integer> iterator = list.iterator(); while(iterator.hasNext()) {
		 * System.out.println(iterator.hasNext()); }
		 */
	}
	
	public static void main(String[] args) {
		ListLinkedlist linkedlist = new ListLinkedlist();
		linkedlist.linkedlist();

	}

}
