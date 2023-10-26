package pack1;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);
		System.out.println("Input the numbers: ");
		int num = kb.nextInt();
		kb.close();
		int count = 0;
		
		if (num <= 1) {
			System.out.println("Not a prime number");
		} else if(num == 2 || num == 3){
			System.out.println("Is a prime number");
		}
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count > 1) {
			System.out.println("Not a prime number");
		} else {
			System.out.println("Is a prime number");
		}
		
	}

}
