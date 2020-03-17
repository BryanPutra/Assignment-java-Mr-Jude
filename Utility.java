package judeassignment17march;

import java.util.Arrays;
import java.util.Scanner;

public class Utility {
	public void storeInputtedArray(int [] givenInt) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < givenInt.length; i++) {
			System.out.println("Enter Integers [" + i + "]: ");
			givenInt[i] = sc.nextInt();
		}
	}
	public void number1function(int [] givenArray) {
		int largest = givenArray[0];
		int largest2 = givenArray[0];
		for(int i = 0; i < givenArray.length; i++){
            if(givenArray[i] > largest){
                largest2 = largest;
                largest = givenArray[i];
            }
            else if(givenArray[i] > largest2){
                largest2 = givenArray[i];
            }
        }
        System.out.println("Number 1:");
        System.out.println("");
        for(int i = 0; i < givenArray.length; i++){
            if(givenArray[i] == largest){
                System.out.print(largest2 + " " + (largest - largest2 + " "));
            }
            else{
                System.out.print(givenArray[i] + " ");
            }
        }
	}
	public void shiftright(int [] givenArray) {
		int temp = givenArray[givenArray.length-1];
		for (int i = givenArray.length - 1; i > 0; i--) {
			givenArray[i] = givenArray[i-1];
		}
		givenArray[0] = temp;
		System.out.println("\nNew Array: " + Arrays.toString(givenArray));
	}
	public void transpose(int matrix [][], int transposed[][], int x) {
		for (int i = 0; i < x; i++) 
	        for (int j = 0; j < x; j++) 
	            transposed[i][j] = matrix[j][i]; 
	}
	public boolean checkSymmetric(int matrix[][], int x) {
		int max = 100;
		int transposed[][] = new int[x][max]; 
	    transpose(matrix, transposed, x); 
	    for (int i = 0; i < x; i++) 
	        for (int j = 0; j < x; j++) 
	            if (matrix[i][j] != transposed[i][j]) 
	                return false; 
	    return true; 
	}
	public void createSquare(int x) {
		int[][] magicSquare = new int[x][x]; 
		int i = x/2; 
        int j = x-1;
        for (int n = 1; n <= x * x;) {
        	if (i==-1 && j==x){ 
                j = x-2; 
                i = 0; 
            } 
            else {
                if (j == x) 
                    j = 0; 
                if (i < 0) 
                    i = x-1; 
            }
        	if (magicSquare[i][j] != 0) {
        		j -= 2;
        		i++;
        		continue;
        	}
        	else
        		magicSquare[i][j] = n++;
        	j++;
        	i--;
        }
        System.out.println("The Size of the square is: " + x );
        for(i=0; i < x; i++) { 
            for(j=0; j < x; j++) 
                System.out.print(magicSquare[i][j]+" "); 
            System.out.println(); 
        } 
	}
}
