package pack1;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);
		System.out.println("Input a number: ");
		int a = kb.nextInt();
		int b = kb.nextInt();
		kb.close();
		
		int c = Math.max(a, b);
		
		System.out.println("The max number is " + c);		
	}

}
