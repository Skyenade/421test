package pack1;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);
		System.out.println("Input the numbers: ");
		int a = kb.nextInt();
		int b = kb.nextInt();
		kb.close();
		System.out.println("Before the swap the first number is " + a);
		System.out.println("Before the swap the second number is " + b);
		int c = 0;
		c = a;
		a = b;
		b = c;
		System.out.println("After the swap the first number is " + a);
		System.out.println("After the swap the second number is " + b);
		
	}

}
