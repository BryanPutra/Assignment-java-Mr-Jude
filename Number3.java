package classmrjude1;
import java.util.Scanner;
import java.util.Arrays;
public class Number3 {
	public static void main(String[] args){
	    Scanner s = new Scanner(System.in);
	    int[] x = new int[20];
	    int positive = 0;
	    int negative = 0;
	    int odd = 0;
	    int even = 0;
	    int zero = 0;
	    for(int i = 0; i < x.length; i++){
	      System.out.println("Enter Integers [" + i + "]: ");
	      x[i] = s.nextInt();

	      if(x[i]>0){
	        positive++;
	      }
	      else if(x[i]<0){
	        negative++;
	      }
	      else{
	        zero++;
	      }
	      if(x[i]%2==0){
	        even++;
	      }
	      else{
	        odd++;
	      }
	    }
	    System.out.println("Array: " + Arrays.toString(x));
	    System.out.println("Positive: " + positive + "\nNegative: " + negative + "\nZero: " + zero + "\nOdd: " + odd + "\nEven: " + even);
	  }
}
