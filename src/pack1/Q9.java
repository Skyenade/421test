package pack1;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);
		System.out.println("Input your age: ");
		int age = kb.nextInt();
		System.out.println("Are you a citizen? ");
		boolean ev = kb.nextBoolean();
		kb.close();
		
		if (age > 18 && ev == true) {
			System.out.println("You are eligible to vote");
		} else {
			System.out.println("You are not eligible to vote");

		}
		
	}

}
