package java1;

public class NoargumentConstructor {
        int id;
        String name;
         NoargumentConstructor() {
        	 //we can initialize value also here
			id = 1;
			name = "Priya";
			//logic
			System.out.println("Object is created");
		}
	public static void main(String[] args) {
		NoargumentConstructor constructor = new NoargumentConstructor();
		System.out.println(constructor.id);
		System.out.println(constructor.name);

	}

}
