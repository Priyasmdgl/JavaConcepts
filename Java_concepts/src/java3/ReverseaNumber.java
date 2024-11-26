package java3;

import java.util.Scanner;

public class ReverseaNumber {
	public void positivenum() {
		int given =0;
		int reversed = 0;
		System.out.println("Enter the number:");
		Scanner scanner = new Scanner(System.in);
		given = scanner.nextInt();
		while(given!=0) {
			reversed = reversed*10;
			reversed = reversed+given%10;
			given = given/10;
	}
		 System.out.println(reversed);
	}
	
	public void negativenum() {
		 int num = -543;
	      int reversenum = 0;
	      Boolean negative = num<0;
	      if(negative) {
	    	  num = - num;
	      }
	      while(num!=0) {
				reversenum = reversenum*10;
				reversenum = reversenum+num%10;
				num = num/10;
			}
	      if(negative) {
	    	  reversenum = -reversenum;
	      }
	      System.out.println(reversenum);
		}
	

	public static void main(String[] args) {
		ReverseaNumber number = new ReverseaNumber();
		number.positivenum();
		number.negativenum();
     
	}
}
