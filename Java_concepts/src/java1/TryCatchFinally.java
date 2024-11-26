package java1;

public class TryCatchFinally {

	public static void main(String[] args) {
		try {
			System.out.println("Inside try block");
			System.out.println(2/0);
			System.out.println("After exception");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Inside catch block");
		}
		finally {
			System.out.println("Inside finally block");
		}
	}
}
