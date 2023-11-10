package pack1;

import java.util.Scanner;

public class Q39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner (System.in);
		System.out.println("Please enter the value of n: ");
		int n = kb.nextInt();
		kb.close();
		
		int counter = 1;
		int factorial = 1;
		do {
			factorial *= counter;
			counter++;
		}
		while (counter<=n);
			
		System.out.println("The factorial is " + factorial);
		
	}

}
