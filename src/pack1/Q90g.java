package pack1;

import java.util.Scanner;

public class Q90g {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int n = kb.nextInt();
		kb.close();
		
		for (int i = 1; i <= n; i++) {
            // Print spaces before the numbers
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print decreasing numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            // Print increasing numbers excluding the first
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }

            // Move to the next line after each row
            System.out.println();
        }

        // Print lower part of the pattern
        for (int i = n - 1; i >= 1; i--) {
            // Print spaces before the numbers
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print decreasing numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            // Print increasing numbers excluding the first
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }

            // Move to the next line after each row
            System.out.println();
        }
	}

}
