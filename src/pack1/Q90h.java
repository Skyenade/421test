package pack1;

import java.util.Scanner;

public class Q90h {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int line = kb.nextInt();
		kb.close();
		
		for (int i = 0; i< line; i++) {
			for (int j = 0; j < line - i -1; j++) {
				System.out.print("  ");
			}
			for (int k = 0; k < 2 * i + 1; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for (int i = line -2; i>= 0; i--) {
			for (int j = 0; j < line - i -1; j++) {
				System.out.print("  ");
			}
			for (int k = 0; k < 2 * i + 1; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
	}

}
