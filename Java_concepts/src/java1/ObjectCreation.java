package java1;

public class ObjectCreation {
	Long accountNumber = 1234567890l;
	String holderName = "Priya";
	int accountBalance = 55;
	
	public void getBalance() {
		System.out.println("Balance is " +accountBalance);
	}
	
    public static void main(String[] args) {
    	//object creation
    	//classname object = new classname();
		ObjectCreation account = new ObjectCreation();
		account.getBalance();
	}

}
