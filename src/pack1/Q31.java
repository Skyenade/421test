package nov11;

import java.util.Scanner;

public class Q31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner (System.in);
		System.out.println("Please enter the value of n: ");
		int n = kb.nextInt();
		kb.close();
		
		int counter = 1;
		int factorial = 1;
		while (counter<=n) {
			factorial *= counter;
			counter++;
		}
		System.out.println("The factorial is " + factorial);
		
	}

}
