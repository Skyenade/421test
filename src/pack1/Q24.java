package pack1;

import java.util.Scanner;

public class Q24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);
		System.out.println("Input the numbers: ");
		int num = kb.nextInt();
		kb.close();		
//		boolean isprime = true;
//		
//		if(num<1) {
//			isprime = false;
//		}
//		
//		for (int i = 2; i <= num/2; i++) {
//			if ((num%i)==0) {
//				isprime = false;
//			}
//		}
//		if(isprime) {
//			System.out.println("Is a prime number");
//		} else if (num%2 == 0){
//			System.out.println("Is an even number");
//		} else {
//			System.out.println("Is an odd number");
//		}
		
		if ( num%2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
		int counter = 0;
		
		for (int i = 0;i<= num;i++) {
			if(num%2==0) {
			counter++;
			}
		}
		
		if(counter == 2) {
			System.out.println("Prime");
		} else {
			System.out.println("Not prime");
		}
		
	}

}
