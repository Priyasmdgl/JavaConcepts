package java1;

public class StringBuilderMethods {

	public static void main(String[] args) {
		    //string builder is mutable
		    StringBuilder name = new StringBuilder("Priya");
		    System.out.println(name);
		    System.out.println(name.append("M"));
		    System.out.println(name);
		    //reverse
		    System.out.println(name.reverse());
			//replace
			System.out.println(name.replace(0, 3, "sri"));
			//delete
			System.out.println(name.delete(0, 3));
			//insert
			System.out.println(name.insert(0, "Pri"));
			//capacity
			System.out.println(name.capacity());
			//finding character at particular index
			System.out.println(name.charAt(5));
			//finding portion of the string
			System.out.println(name.substring(3));
			//finding the length
			System.out.println(name.length());
	}


}
