package pack1;

import java.util.Scanner;

public class Q90d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int line = kb.nextInt();
		kb.close();
		
		for (int i = 0; i<= line; i++) {
			for (int j = 0; j< line - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i = 0; i <= line; i++) {
			for (int j = 0; j<i;j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < line -i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
