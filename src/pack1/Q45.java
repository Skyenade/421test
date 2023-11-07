package nov11;

import java.util.Scanner;

public class Q45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner (System.in);
		System.out.println("Please enter the value of n: ");
		int n = kb.nextInt();
		kb.close();
		
		int factorial = 1;
		
			
		for (int i = 1;i<=n;i++) {
			factorial *= i;
		}
		System.out.println("The factorial is " + factorial);

	}

}
