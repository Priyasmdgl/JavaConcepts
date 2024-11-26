package java1;

public class StringMethods {

	public static void main(String[] args) {
		//string creation
		String name = "Priya"; //by string literal
		String name1 = new String("Jayanthi"); //by new keyword
		System.out.println(name);
		System.out.println(name1);
		//returns character at particular index
		System.out.println(name.charAt(4));
		//returns string length
		System.out.println(name1.length());
		//checks the equality of the string
		System.out.println(name.equals("priya"));
		//checks the equality with ignorecase
		System.out.println(name.equalsIgnoreCase("priya"));
		//checks if string is empty or not
		System.out.println(name.isEmpty());
		//checks if the value is present or not
		System.out.println(name.contains("i"));
        //taking a portion of the string from beginning
		System.out.println(name.substring(1));
		//taking a portion of the string from start to end
		System.out.println(name1.substring(0, 3));
		//appending the string to the given string
		System.out.println(name.concat("Venkateshwari"));
		//replacing the existing with the given one
		System.out.println(name1.replace("a", "e"));
		System.out.println(name.replace("Priya", "Venkateshwari"));
		//find the position of a character in the string
		System.out.println(name1.indexOf("i"));
		System.out.println(name1.indexOf("y", 1));
		System.out.println(name1.indexOf('J'));
		System.out.println(name1.indexOf("thi", 0));
		//trim will remove the spaces before and after it 
		String name2 = " Raghav ";
		System.out.println(name2.trim());
		//converting the given datatype to string
		int number = 5;
		System.out.println(String.valueOf(number));
		//upper to lower case
		System.out.println(name.toLowerCase());
		//lower to upper case
		System.out.println(name.toUpperCase());
		//returns a joined string with the given delimiter
		System.out.println(String.join(".", "19","11","2024"));
		//spliting the words
		String words = "How,are,you?";
		String[] spliting = words.split(",");
				for (String string : spliting) {
					System.out.println(string);
				}
        //string is immutable
		String name3 = "Veera";
		System.out.println(name3.concat("Raghavan"));
		System.out.println(name3);
	}

}
