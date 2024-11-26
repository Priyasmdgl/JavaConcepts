package java3;

public class NoofVowels {

	public static void main(String[] args) {
		String given = "Priya Venkateshwari";
		int vowels = 0;
		given = given.toLowerCase();
		for(int i=0;i<given.length();i++) {
			if(given.charAt(i)=='a'||given.charAt(i)=='e'||given.charAt(i)=='i'||given.charAt(i)=='o'||given.charAt(i)=='u') {
				vowels++;
			}
		}
         System.out.println(vowels);
	}

}
