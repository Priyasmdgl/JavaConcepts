package java3;

public class OccurenceofCharacter {

	public static void main(String[] args) {
		//using iteration
		String given = "Venkateshwari";
		char find = 'a';
		int occurence = 0;
		given = given.toLowerCase();
		for(int i=0;i<given.length();i++) {
			if(given.charAt(i)==find) {
				occurence++;
			}
		}
         System.out.println(occurence); 
	}

}
