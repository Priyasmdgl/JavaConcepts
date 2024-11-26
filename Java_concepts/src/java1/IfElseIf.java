package java1;

public class IfElseIf {
    String myfavourite = "Milkshake";
    public void choices() {
    	if(myfavourite.equals("Coffee")) {
    		System.out.println("My Favourite");
    	}else if (myfavourite.equals("Tea")) {
			System.out.println("Not my favourite");
		}else if (myfavourite.equals("Milk")) {
			System.out.println("Not my favourite");
		}else {
			System.out.println("Sorry we have no other options");
		}
    }
	public static void main(String[] args) {
		IfElseIf condition = new IfElseIf();
		condition.choices();
	}
}
