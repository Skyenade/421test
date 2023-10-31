package pack1;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);
		System.out.println("Input the numbers: ");
		int num = kb.nextInt();
		kb.close();		
		boolean isprime = true;
		
		if(num<1) {
			isprime = false;
		}
		
		for (int i = 2; i <= num/2; i++) {
			if ((num%i)==0) {
				isprime = false;
			}
		}
		if(isprime) {
			System.out.println("Is a prime number");
		} else {
			System.out.println("Not a prime number");
		}
	}

}
