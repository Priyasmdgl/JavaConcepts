package java3;

public class StringLength {

	public static void main(String[] args) {
		//using length method
		String name = "Priya";
		System.out.println(name.length());
		//without using length method
		String given = "Venkateshwari";
		char[] array = given.toCharArray();
		int length = 0;
		for (char c : array) {
			length++;
		}
        System.out.println(length);
	}

}
