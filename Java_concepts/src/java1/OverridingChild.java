package java1;

public class OverridingChild extends PolymorphismOverriding{
    @Override
	public void property() {
		System.out.println("4 BHK");
	}
	public static void main(String[] args) {
		//parentref ref = new childref();
		PolymorphismOverriding overriding = new OverridingChild();
		overriding.parent();
		overriding.property();

	}

}
