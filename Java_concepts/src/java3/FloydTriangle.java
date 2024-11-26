package java3;

import java.util.Scanner;

public class FloydTriangle {

	public static void main(String[] args) {
		//printing *
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the number of lines");
	int num_of_lines = scanner.nextInt();
	int row,col;
	for(row=0;row<num_of_lines;row++) {
		for(col=0;col<=row;col++) {
			System.out.print("* ");
		}
		System.out.println();
	}
	//printing numbers
	Scanner scanner2 = new Scanner(System.in);
	System.out.println("Enter the number");
	 int limit = scanner2.nextInt();
	 int startingnumber=1;
	 int rows,column;
	 for(rows=0;rows<limit;rows++) {
		 for(column=0;column<=rows;column++) {
			 System.out.print(startingnumber+" ");
			 startingnumber++;
		 }
		 System.out.println();
	 }
	}
}
