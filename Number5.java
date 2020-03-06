package classmrjude1;
import java.util.Scanner;
import java.util.Arrays;
public class Number5 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int x [] = new int [5];
		for(int i = 0; i < x.length; i++) {
			System.out.println("Enter Integer [" + i + "]: ");
			x[i] = sc.nextInt();
		}
		System.out.println("The Array: " + Arrays.toString(x));
		int largest = x[0];
	    int smallest = x[0];

	    for(int i = 0; i < x.length; i++){
	      if(x[i] > largest)
	        largest = x[i];
	      if(x[i] < smallest)
	        smallest = x[i];
	    }

	    System.out.println("The largest is " + largest + " and smallest is " + smallest);
	}
}

