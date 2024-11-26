package java3;

import java.util.Scanner;

public class PositionofanAlphabet {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value");
		char given = scanner.next().charAt(0);
		given = Character.toLowerCase(given);
		int ascii = (int)given;
		System.out.println(ascii);
		int position = ascii-96;
		System.out.println(position);

	}

}
