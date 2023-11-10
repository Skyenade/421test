package pack1;

import java.util.Scanner;

public class Q41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner (System.in);
		System.out.println("Please enter a number: ");
		int num = kb.nextInt();
		kb.close();
		
		int rev = 0;
		
		do {
			int remainder = num % 10;
			rev = rev * 10 + remainder;
			num = num / 10;
		}
		while (num != 0);
		System.out.println("The reverse of the number is " + rev);
		kb.close();
		
	}

}
