package java3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ReverseaString {

	public static void main(String[] args) {
		
		//string reverse using string buffer
		String given = "Priya";
		StringBuffer buffer = new StringBuffer();
		buffer.append(given);
		System.out.println(buffer.reverse());
		//using string builder
		StringBuilder builder = new StringBuilder("Raghav");
		System.out.println(builder.reverse());
		//own logic
		String name = "Jayanthi";
		char[] array = name.toCharArray();
		String reversed ="";
		for(int i=array.length-1;i>=0;i--) {
			reversed = reversed+array[i];
		}
		System.out.println(reversed);
        //using collections
		String name2 = "Priya";
		char[] char_array = name2.toCharArray();
		List<Character> list = new ArrayList<Character>();
		for (Character character : char_array) {
			list.add(character);
		}
		Collections.reverse(list);
		for (Character character : list) {
			System.out.println(character);
		}
		}
		
	}


