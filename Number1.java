package classmrjude1;
import java.util.Scanner;
import java.util.Arrays;
public class Number1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] x = new int [10];
		for (int i = 0; i < x.length; i++) {
			System.out.println("Enter Integers: ");
			x[i] = sc.nextInt();
		}
		System.out.println("Array of the inputted Intergers: " + Arrays.toString(x));
		
	}
}