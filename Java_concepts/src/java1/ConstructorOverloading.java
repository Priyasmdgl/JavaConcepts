package java1;

public class ConstructorOverloading {
        String city;
        ConstructorOverloading(){
        	city = "Dindigul";
        	System.out.println(city);
        }
        ConstructorOverloading(String place){
        	city = place;
        	System.out.println(city);
        }
	public static void main(String[] args) {
		ConstructorOverloading overloading = new ConstructorOverloading();
		ConstructorOverloading overloading2 = new ConstructorOverloading("Bangalore");

	}

}
