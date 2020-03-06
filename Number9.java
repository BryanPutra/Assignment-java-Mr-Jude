package classmrjude1;
import java.util.Scanner;
import java.util.Arrays;

public class Number9 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array length: ");
		int n = sc.nextInt();
		int x [] = new int [n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter elements [" +  i  + "]: ");
			x[i] = sc.nextInt();
		}
		System.out.println("The Array: " + Arrays.toString(x));
		int temp = x[n-1];
		for (int i = n - 1; i > 0; i--) {
			x[i] = x[i-1];
		}
		x[0] = temp;
		System.out.println("New Array: " + Arrays.toString(x));
	}
}
