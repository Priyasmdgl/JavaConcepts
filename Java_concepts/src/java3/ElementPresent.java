package java3;

import java.util.stream.IntStream;

public class ElementPresent {

	public static void main(String[] args) {
		int given[] = {1,3,5,2,4};
		int num = 5;
		Boolean found = false;
		for(int i=0;i<given.length;i++) {
			if(given[i]==num) {
				found = true;
				break;
			}
		}if(found) {
			System.out.println("Number is present");
		}else {
			System.out.println("Number is not present");
		}
		//using int stream
		Boolean result = IntStream.of(given).anyMatch(element->element == num);
		if(found) {
			System.out.println("Present");
		}else {
			System.out.println("Not present");
		}
	}
}
