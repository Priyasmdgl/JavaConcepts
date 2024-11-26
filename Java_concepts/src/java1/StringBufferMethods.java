package java1;

public class StringBufferMethods {

	public static void main(String[] args) {
		//string buffer is mutable
		StringBuffer name = new StringBuffer("Priya");
		System.out.println(name.append("Venkateshwari"));
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
