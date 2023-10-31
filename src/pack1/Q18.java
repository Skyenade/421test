package pack1;

import java.util.Scanner;

public class Q18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);
		System.out.println("Input the number: ");
		int num = kb.nextInt();
		kb.close();
		
		if (num > 0) {
			System.out.println("The number is positive");
		} else if (num < 0) {
			System.out.println("The number is negative");
		} else {
			System.out.println("The number is 0");
		}
		
	}

}
