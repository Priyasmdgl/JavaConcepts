package java3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SmallnoinArray {

	public static void main(String[] args) {
		Integer given[] = {5,3,1,2,4};
		int smallest = given[0];
		for(int i=0;i<given.length;i++) {
			if(given[i]<smallest) {
				smallest=given[i];
			}
		}
       System.out.println(smallest);
       //using arrays
       Arrays.sort(given);
       System.out.println(given[0]);
       //using collections
       List<Integer> list = Arrays.asList(given);
       Collections.sort(list);
       int smallno = list.get(0);
       System.out.println(smallno);
       
	}

}
