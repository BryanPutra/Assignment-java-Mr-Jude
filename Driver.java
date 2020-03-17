package judeassignment17march;
import java.util.Arrays;
import java.util.Scanner;

public class Driver {
	public static void main(String [] args) {
		Utility obj = new Utility();
		Utility obj1 = new Utility();
		int x [] = new int[5];
		obj.storeInputtedArray(x);
		System.out.println("Array: " + Arrays.toString(x));
		// Number 1
		obj.number1function(x);
		
		// Number 2
		obj.shiftright(x);
		
		// Number 3
		int matrix [][] = { 
				{ 1, 2, 3 }, 
                { 4, 5, 6 }, 
                { 7, 8, 9 } 
                }; 
		int matrix1 [][] = { { 1, 3, 5 }, 
                { 3, 2, 4 }, 
                { 5, 4, 1 } }; 
		if(obj1.checkSymmetric(matrix, 3))
			System.out.println("Symmetric");
		else
			System.out.println("Not Symmetric");
		// if want to check symmetric use the matrix1
		
		// Number 4
		int y = 7;
		obj1.createSquare(y);
		// i was only able to figure out the odd one sorry
	}
}
