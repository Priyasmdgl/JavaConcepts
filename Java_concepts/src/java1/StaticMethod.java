package java1;

public class StaticMethod {
	//static block
	static {
		System.out.println("Inside static block1");
	}
	static {
		System.out.println("Inside static block2");
	}
	//static method
	public static void static_method() {
		System.out.println("It is a static method, hence object is not created");
	}
	//non static method
	public void non_static_method() {
		System.out.println("Non static method");
		static_method();
	}

	public static void main(String[] args) {
		System.out.println("Inside Main method");
		//calling static method
		static_method();
		//calling non static method
		StaticMethod method = new StaticMethod();
		method.non_static_method();
       
	}

}
