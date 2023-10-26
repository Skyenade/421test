package pack1;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);
		System.out.println("Input a number: ");
		int a = kb.nextInt();
		kb.close();
		
		int factorial = 1;
		
		for(int i = 1; i<=a;i++) {
			factorial *= i;
		}
		
		System.out.println("The factorial of " + a + " is: " + factorial);
	}

}
