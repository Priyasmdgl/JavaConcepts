package java1;

public class PolymorphismOverloading {
	int add(int a , int b) {
		return a+b;
	}
	double add(double a, double b) {
		return a+b;
	}
	public static void main(String[] args) {
		PolymorphismOverloading polymorphism = new PolymorphismOverloading();
		System.out.println(polymorphism.add(5, 5));
        System.out.println(polymorphism.add(2.5, 2.5));
	}

}
