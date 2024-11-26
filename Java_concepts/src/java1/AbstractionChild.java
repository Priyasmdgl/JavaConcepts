package java1;

public class AbstractionChild extends AbstractionParent{
	@Override
	public void amount() {
		System.out.println("1 crore");
	}
	public void property() {
		System.out.println("4 BHK");
	}

	public static void main(String[] args) {
		AbstractionParent parent = new AbstractionChild();
		parent.amount();
		parent.property();
	}
}
