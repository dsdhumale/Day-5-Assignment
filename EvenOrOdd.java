package Day5;

import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number :");
		int num = scanner.nextInt();

		if (num % 2 == 0) {
			System.out.println(num + " is Even number ");
		} else {
			System.out.println(num + " is Odd number ");
		}

	}
}
