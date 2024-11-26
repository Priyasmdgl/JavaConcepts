package java3;

public class LeadingSpaces {

	public static void main(String[] args) {
     //using trim
		String given = " Hello World ";
		System.out.println(given.trim());
		//using regex
		System.out.println(given.replaceAll("^[ \t]+|[ \t]+$", ""));
		//removing leading space
		System.out.println(given.replaceAll("^[ \t]", ""));
		//removing trailing space
		System.out.println(given.replaceAll("[ \t]+$", ""));
	}

}
