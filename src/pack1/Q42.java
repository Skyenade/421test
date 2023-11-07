package nov11;

import java.util.Scanner;

public class Q42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner (System.in);
		System.out.println("What's the base? ");
		int base = kb.nextInt();
		System.out.println("What's the exponent? ");
		int exponent = kb.nextInt();
		kb.close();
		
		int power = 1;
		do {
			power *= base;
			exponent--;
		} while (exponent > 0);
		System.out.println(power);
	}

}
