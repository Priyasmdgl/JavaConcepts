package java1;

public class TryCatch {

	public static void main(String[] args) {
		try {
			int a=0;
			int b=5;
			int result = b/a;
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Dont divide it as you will get error");
		}

	}

}
