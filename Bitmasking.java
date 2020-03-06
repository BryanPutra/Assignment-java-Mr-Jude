package classmrjude1;

public class Bitmasking {
	public static void main(String [] args) {
		//ascii to digit
        int mask = '\u000F';
        int x = '1';
        int y = x & mask;
        System.out.println(x);
        //digit to ascii
        int mask2 = '\u0030';
        int a = 1;
        int b = a | mask2;
        System.out.println(a);
	}
}
