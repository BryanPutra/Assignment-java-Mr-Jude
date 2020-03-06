package classmrjude1;
import java.util.Arrays;
import java.util.Scanner;

public class Number8 {
	public static void main(String [] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of array: ");
		n = sc.nextInt();
		int x [] = new int [n];
		int largest = x[0];
		int largest2 = x[0];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter Integers [" + i + "]: ");
		    x[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++){
            if(x[i] > largest){
                largest2 = largest;
                largest = x[i];
            }
            else if(x[i] > largest2){
                largest2 = x[i];
            }
        }
        System.out.println("Number 8:");
        System.out.println("");
        for(int i = 0; i < n; i++){
            if(x[i] == largest){
                System.out.print(largest2 + " " + (largest - largest2 + " "));
            }
            else{
                System.out.print(x[i] + " ");
            }
        }
	}
}