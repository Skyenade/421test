package pack1;

import java.util.Scanner;

public class Q38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner (System.in);
		System.out.println("What's the base? ");
		int n = kb.nextInt();
		kb.close();
		int i = 1;
		int sum = 0;
		do {
			sum = sum + i;
			i++;
		} while (i <= n);
		
		System.out.println("The sum is " + sum);
		
		
		
	}

}
