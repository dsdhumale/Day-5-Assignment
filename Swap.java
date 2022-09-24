package ifelse;
import java.util.Scanner;
public class Swap {
	public static void main(String[] args) {
		System.out.println("enter value of ..a..");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("enter value of ..b..");
		int b = sc.nextInt();
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("value of a = " + a );
		System.out.println("value of b = " + b );
	}

}
