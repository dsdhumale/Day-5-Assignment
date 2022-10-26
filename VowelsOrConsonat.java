package Day5;

import java.util.Scanner;

public class VowelsOrConsonat {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any character :");
		char ch = scanner.next().charAt(0);

		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
				|| ch == 'O' || ch == 'U') {
			System.out.println("Entered character " + ch + " is  Vowel");
		} else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
			System.out.println("Entered character " + ch + " is  Constant");
		} else {
			System.out.println("Invalid Input");
		}
	}
}
