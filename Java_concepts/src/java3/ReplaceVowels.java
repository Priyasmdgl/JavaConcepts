package java3;

public class ReplaceVowels {

	public static void main(String[] args) {
		String given = "Java course";
		//using iteration
		char[] array = given.toCharArray();
		for(int i=0;i<given.length();i++) {
		if(given.charAt(i)=='A' || given.charAt(i)=='E' || given.charAt(i)=='I' || given.charAt(i)=='O' ||
				given.charAt(i)=='U' || given.charAt(i)=='a' || given.charAt(i)=='e' || given.charAt(i)=='i' || given.charAt(i)=='o' ||
				given.charAt(i)=='u')
			array[i] = '*';			
		}
        for(int i=0;i<given.length();i++) {
        	System.out.print(array[i]);
        }
        //using regular expression
        String replace = given.replaceAll("[AEIOUaeiou]", "*");
        System.out.println(replace);
        //for $ we should specify with \\$
        String result = given.replaceAll("[AEIOUaeiou]", "\\$");
        System.out.println(result);
	}

}
