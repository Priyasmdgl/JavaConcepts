package java1;

public class ChildInheritance  extends ParentInheritance{

	public static void main(String[] args) {
		ChildInheritance inheritance = new ChildInheritance();
		int money2 = inheritance.money;
		System.out.println(money2);
		inheritance.home();
	}
}
