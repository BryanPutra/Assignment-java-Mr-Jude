package classmrjude1;
import java.util.Scanner;
import java.util.Arrays;

public class Number7 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int x [] = new int [10];
		for (int i = 0; i < 10; i++) {
			System.out.println("Enter elements [" + i + "]: ");
			x[i] = sc.nextInt();
		}
		System.out.println("The Array: " + Arrays.toString(x));
		int n = x.length / 2;
		int y [] = new int [n];
		int z [] = new int [x.length - n];
		for (int i = 0; i < x.length; i++) {
			if (i < y.length) {
				y[i] = x[i];
			}
			else {
				z[i - n] = x[i];
			}
		}
		System.out.println("Splitted Array: " + Arrays.toString(y));
		System.out.println("Splitted Array2: " + Arrays.toString(z));
	}
	
}
