package java3;

import java.util.Arrays;
import java.util.HashSet;

public class MissingAlphabet {

	public static void main(String[] args) {
		String given = "abcd";
		given = given.toLowerCase();
		given = given.replaceAll(" ", "");
		String[] givenarray = given.split("");
		String[] alphabets = "abcdefghijklmnopqrstuvwxyz".split("");
		HashSet<String> set1 = new HashSet<String>(Arrays.asList(givenarray));
		HashSet<String> set2 = new HashSet<String>(Arrays.asList(alphabets));
		set2.removeAll(set1);
		System.out.println(set2);

	}

}
