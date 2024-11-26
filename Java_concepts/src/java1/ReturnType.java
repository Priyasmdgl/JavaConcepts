package java1;

public class ReturnType {
     int amount = 500;
     public int collectAmount() {
			System.out.println("collected amount is " + amount);
			return amount;
		}

	public static void main(String[] args) {
		ReturnType returnType = new ReturnType();
	    int returnamount = returnType.collectAmount();
	    System.out.println("returntype amount is "+returnamount);
	}

}
