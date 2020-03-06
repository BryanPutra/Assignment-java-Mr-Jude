package classmrjude1;
import java.util.Scanner;
import java.util.Arrays;
public class Number4 {
	public static void main(String [] args) {
		int n;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount of elements to put in the array: ");
		n = sc.nextInt();
		int [] x = new int [n];
		System.out.println("Enter the elements: ");
		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
			sum = sum + x[i];
		}
		System.out.println("The Sum of the array is: " + sum);
	}
	
}
