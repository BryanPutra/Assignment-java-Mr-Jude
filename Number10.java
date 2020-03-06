package classmrjude1;
import java.util.Arrays;
import java.util.Scanner;

public class Number10 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array length: ");
		int n = sc.nextInt();
		int x [] = new int [n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter elements [" +  i  + "]: ");
			x[i] = sc.nextInt();
		}
		int temp;
		System.out.println("The Array: " + Arrays.toString(x));
		for(int i = 0; i < n - 1 ; i++){
            for(int j = 0; j < n - i - 1; j++){
                if(x[j] > x[j + 1]){
                    temp = x[j];
                    x[j] = x[j + 1];
                    x[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted Array: " + Arrays.toString(x));
	}
}