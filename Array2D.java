package ifelse;
import java.util.Scanner;
public class Array2D {
	public static void main(String[] args) {
	System.out.println("Enter array size");
    Scanner sc =new Scanner(System.in);
    int m = sc.nextInt();
    System.out.println("Row size:"+m);
    int n = sc.nextInt();
    System.out.println("Column size:"+n);
    System.out.println("Enter elements ");
    int array[][]=new int[m][n] ;
    for(int i=0;i<m;i++) {
        for(int j=0;j<n;j++) {
        array[i][j]=sc.nextInt();
        }
    }
    System.out.println("Enter elements are ");
    for (int i=0;i<array.length;i++){ 
        for (int j=0;j<array[i].length;j++) {
        System.out.print(" " + array [i][j] ); 
    }
        System.out.println("");
    }
	}
}
	
