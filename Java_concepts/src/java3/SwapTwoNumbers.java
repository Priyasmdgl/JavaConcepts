package java3;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		//using third variable
		int a=50;
		int b=90;
		System.out.println("Before swapping");
		System.out.println("a:" +a +"b:" +b);
		int temp=a;
		a=b;
		b=temp;
		System.out.println("After swapping");
		System.out.println("a:" +a + "b:" +b);
		//without using third variable
		int first = 5;
		int second = 10;
		System.out.println("Before swapping");
		System.out.println("first:" +first +"second:" +second);
		//using add,sub
		first = first-second;
		second = first+second;
		first = second-first;
		//using mul,div
		 first = first*second; 
		 second = first/second; 
		 first= first/second;
		 
		System.out.println("After swapping");
		System.out.println("first:" +first + "second:" +second);
		
	}

}
