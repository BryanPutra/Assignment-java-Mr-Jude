package classmrjude1;
import java.util.Arrays;

public class arrayjava {
	public static void main(String[] args) {
        int[] x = {1,2,3,4,5};
        System.out.println("Array: " + Arrays.toString(x));
        for (int i = 0; i < x.length / 2; i++) {
        	int temp = x[i];
        	x[i] = x[x.length - i - 1];
        	x[x.length - i - 1] = temp;
        }
        System.out.println("Flipped Array: " + Arrays.toString(x));
    }
}
