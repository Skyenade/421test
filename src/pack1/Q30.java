package pack1;

import java.util.Scanner;

public class Q30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);
		System.out.println("Input a number: ");
		int n = kb.nextInt();
		kb.close();
		
		int count = 0;
		int i = 1;
				
		while (i<=n) {
			count = i + count;
			i++;
		}
		
		System.out.println("The sum is " + count);
			
		
	}

}
