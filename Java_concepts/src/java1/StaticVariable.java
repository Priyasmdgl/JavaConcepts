package java1;

public class StaticVariable {
     static int balance = 5000;
     String holder;
	public static void main(String[] args) {
		StaticVariable variable = new StaticVariable();
		variable.balance = 10000;
		variable.holder = "Priya";
		StaticVariable variable2 = new StaticVariable();
		balance = 15000;
		variable2.holder = "Raghav";
		System.out.println(balance);
        System.out.println(variable.holder);
        System.out.println(balance);
        System.out.println(variable2.holder);
	}

}
