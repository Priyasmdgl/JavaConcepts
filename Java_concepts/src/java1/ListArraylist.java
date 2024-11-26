package java1;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListArraylist {
	
     public void arraylist() {
    	 List<String> arraylist = new ArrayList<String>();
    	 //inserting data into list
    	 arraylist.add("Jayanthi");
    	 arraylist.add("Priya");
    	 arraylist.add("Raghav");
    	 System.out.println(arraylist);
    	 //retrieving data from list
    	 System.out.println(arraylist.get(1));
    	 //to find the index of the particular data
    	 System.out.println(arraylist.indexOf("Jayanthi"));
    	 System.out.println(arraylist.lastIndexOf("Raghav"));
    	 //if element is not present it will return -1
    	 System.out.println(arraylist.indexOf("Venkateshwari"));
         //copying a list to another list
    	 List<String> arraylist2 = new ArrayList<String>();
    	 arraylist2.addAll(arraylist);
    	 System.out.println(arraylist2);
    	 //clear elements from the list
    	 arraylist2.clear();
    	 System.out.println(arraylist2);
    	 //remove an element
    	 arraylist.remove("Raghav");
    	 System.out.println(arraylist);
    	 //null insertion
    	 arraylist2.add(null);
    	 System.out.println(arraylist2);
    	 //to update a data in the list
    	 arraylist2.set(0, "Car");
    	 System.out.println(arraylist2);
    	 //list is empty or not
    	 System.out.println(arraylist2.isEmpty());
    	 //checks the size of the array
    	 System.out.println(arraylist.size());
    	 //checks if an element is present
    	 System.out.println(arraylist.contains("Jayanthi"));
    	 //iterate elements in an array
    	 //using for-each
    	 for (String string : arraylist) {
			System.out.println(string);
		}
    	 //using for loop
    	 int i=0;
    	 for (i=0;i<arraylist.size();i++) {
    		 System.out.println(arraylist.get(i));
    	 }
    	 //using iterator
    	 ListIterator<String> iterator = arraylist.listIterator();
    		 while(iterator.hasNext()) {
             System.out.println(iterator.next());
    		 }
    		 
     }
	public static void main(String[] args) {
		ListArraylist arraylist = new ListArraylist();
		arraylist.arraylist();

	}

}
