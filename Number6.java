package classmrjude1;
import java.util.Scanner;
import java.util.Arrays;
public class Number6 {
	public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
	    int x [] = new int [6];
	    for (int i = 0; i < 6; i++) {
	    	System.out.println("Enter elements to make an array [" + i + "]: ");
	    	x[i] = sc.nextInt();
	    }
	    System.out.println("Array: " + Arrays.toString(x));
	    boolean read = true;
	    int y = x.length - 1;
	    for (int i = 0; i < x.length / 2; i++) {
	    	if(x[i] != x[y]) {
	    		read = false;
	    		break;   	
	    	}
	    	else {
	    		y--;
	    	}
	    }
	    System.out.println(read);
	    
	}   
}
