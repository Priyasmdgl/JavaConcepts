package java1;

import java.util.Vector;

public class LinkVector {
	public void vector() {
		Vector<String> vector = new Vector<String>();
		//insertion
		vector.add("Priya");
		vector.add("Jayanthi");
		System.out.println(vector);
		//deletion
		vector.remove("Priya");
		System.out.println(vector);
		//retrieving
		System.out.println(vector.get(0));
		//setting an element
		System.out.println(vector.set(0, "Raghav"));
		//size
		System.out.println(vector.size());
		//contains an element
		System.out.println(vector.contains("Priya"));
		//capacity
		System.out.println(vector.capacity());
	}

	public static void main(String[] args) {
		LinkVector vector = new LinkVector();
		vector.vector();
	}

}
