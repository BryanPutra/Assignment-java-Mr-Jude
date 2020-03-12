import java.util.Scanner;
import java.util.Arrays;

public class Methods {
	public static void main(String [] args) {
		// Number 1
		Methodsclass obj1 = new Methodsclass();
		int [] x = new int[10];
		obj1.storeInputtedArray(x);
		System.out.println("Array of the inputted Intergers: " + Arrays.toString(x));
		
		
		// Number 2
		obj1.checkpresent(x);
		
		// Number 3
		Methodsclass obj2 = new Methodsclass();
		int [] y = new int[20];
		obj2.storeInputtedArray(y);
		obj2.printposnegoddeven0(y);
		
		// Number 4
		obj1.sumArray(x);
		
		// Number 5
		obj1.findlargest(x);
		obj1.findsmallest(x);
		
		// Number 6
		obj1.readfrontbackequal(x);
		
		// Number 7
		obj1.splitarray(x);
		
		// Number 8
		obj1.number8function(x);
		
		// Number 9
		obj1.shiftright(x);
		
		// Number 10
		obj1.sortascend(x);
	}
}