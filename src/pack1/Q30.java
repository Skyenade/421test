package pack1;

import java.util.Scanner;

public class Q30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner (System.in);
		System.out.println("Please enter the value of n: ");
		int n = kb.nextInt();
		kb.close();
		int sum = 0;
		int counter = 1;
		while (counter<=n) {
			sum = sum + counter;
			counter++;
		}
		System.out.println("The sum is: " + sum);

		
	}

}
