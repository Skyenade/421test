package pack1;

import java.util.Scanner;

public class Q90a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int line = kb.nextInt();
		kb.close();
		
		for(int i = 0; i <= line; i++) {
			for (int j = i; j >=0;j--) {
				System.out.print(line-j);
			}
			System.out.println();
		}
		
	}

}
