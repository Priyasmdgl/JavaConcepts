package java3;

public class ExtractingNumbers {

	public static void main(String[] args) {
		String given = "Priya123";
		int num = 0;
		for(int i=0;i<given.length();i++) {
			char character = given.charAt(i);
			if(Character.isDigit(character)) {
				num = num+Character.getNumericValue(character);
			}
		}
        System.out.println(num);
	}

}
