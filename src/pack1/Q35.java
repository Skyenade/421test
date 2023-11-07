package nov11;

import java.util.Scanner;

public class Q35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner (System.in);
		System.out.println("What's the base? ");
		int base = kb.nextInt();
		System.out.println("What's the exponent? ");
		int exponent = kb.nextInt();
		kb.close();
		
		int result = 1;
		
		while (exponent > 0) {
			result *= base;
			exponent--;
		}
		
		System.out.println(base + " to the power of " + exponent + " is " + result);
		
	}

}
