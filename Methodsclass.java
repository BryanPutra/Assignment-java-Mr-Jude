import java.util.Scanner;
import java.util.Arrays;

public class Methodsclass {
	public void storeInputtedArray(int [] givenInt) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < givenInt.length; i++) {
			System.out.println("Enter Integers [" + i + "]: ");
			givenInt[i] = sc.nextInt();
		}
	}
	public void checkpresent(int [] givenInt) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int checknumber = sc.nextInt();
		for(int i = 0; i < 10; i++) {
            if (givenInt[i] == checknumber) {
                System.out.println("Number is in the array !");
                break;
            }
            if (i == 9) {
            	System.out.println("Number is not in the array.");
            }
        }
	}
	public void printposnegoddeven0 (int [] givenArray) {
		int positive = 0;
	    int negative = 0;
	    int odd = 0;
	    int even = 0;
	    int zero = 0;
	    for(int i = 0; i < givenArray.length; i++){
	    	if(givenArray[i]>0){
		        positive++;
		      }
		      else if(givenArray[i]<0){
		        negative++;
		      }
		      else{
		        zero++;
		      }
		      if(givenArray[i]%2==0){
		        even++;
		      }
		      else{
		        odd++;
		      }
	    }
	    System.out.println("Array: " + Arrays.toString(givenArray));
	    System.out.println("Positive: " + positive + "\nNegative: " + negative + "\nZero: " + zero + "\nOdd: " + odd + "\nEven: " + even);
	}
	public void sumArray(int [] givenArray) {
		int sum = 0;
		for (int i = 0; i < givenArray.length; i++) {
			sum = sum + givenArray[i];
		}
		System.out.println("The Sum of the first array is: " + sum);
	}
	public void findlargest(int [] givenArray) {
		int largest = givenArray[0];
		for(int i = 0; i < givenArray.length; i++){
		      if(givenArray[i] > largest)
		        largest = givenArray[i];
		}
		System.out.println("The largest in the first array is " + largest );
	}
	public void findsmallest(int [] givenArray) {
		int smallest = givenArray[0];
		for (int i = 0; i < givenArray.length; i++) {
			if(givenArray[i] < smallest)
				smallest = givenArray[0];
		}
		System.out.println("The smallest in the first array is" + smallest);
	}
	public void readfrontbackequal(int [] givenArray) {
		boolean read = true;
	    int x = givenArray.length - 1;
	    for (int i = 0; i < givenArray.length / 2; i++) {
	    	if(givenArray[i] != givenArray[x]) {
	    		read = false;
	    		break;   	
	    	}
	    	else {
	    		x--;
	    	}
	    }
	    System.out.println(read);
	}
	public void splitarray(int [] givenArray) {
	int n = givenArray.length / 2;
		int y [] = new int [n];
		int z [] = new int [givenArray.length - n];
		for (int i = 0; i < givenArray.length; i++) {
			if (i < y.length) {
				y[i] = givenArray[i];
			}
			else {
				z[i - n] = givenArray[i];
			}
		}
		System.out.println("Splitted Array: " + Arrays.toString(y));
		System.out.println("Splitted Array2: " + Arrays.toString(z));
	}
	public void number8function(int [] givenArray) {
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
        System.out.println("Number 8:");
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
		System.out.println("New Array: " + Arrays.toString(givenArray));
	}
	public void sortascend(int [] givenArray) {
		int temp;
		for(int i = 0; i < givenArray.length - 1 ; i++){
            for(int j = 0; j < givenArray.length - i - 1; j++){
                if(givenArray[j] > givenArray[j + 1]){
                    temp = givenArray[j];
                    givenArray[j] = givenArray[j + 1];
                    givenArray[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted Array: " + Arrays.toString(givenArray));
	}
}