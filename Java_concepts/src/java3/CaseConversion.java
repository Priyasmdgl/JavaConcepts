package java3;

public class CaseConversion {

	public static void main(String[] args) {
		//upper to lowercase
		String given = "PRIYA VENKATESHWARI";
		char[] array = given.toCharArray();
		for(int i=0;i<given.length();i++) {
			if(array[i]>=65 && array[i]<=90) {
				array[i] = (char) (array[i]+32);
			}
		}
          for(int i=0;i<given.length();i++) {
        	  System.out.print(array[i]);
          }
          //lower to uppercase
          String given1 = "jayanthi";
          char[] array1 = given1.toCharArray();
          for(int i=0;i<given1.length();i++) {
        	  if(array1[i]>=97 && array1[i]<=122) {
        		  array1[i] = (char) (array1[i]-32);
        	  }
          }
          for(int i=0;i<given1.length();i++) {
        	  System.out.print(array1[i]);
          }
	}

}
