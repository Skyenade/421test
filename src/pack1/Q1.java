package pack1;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Input a number: ");
		int a = kb.nextInt();
		kb.close();
		
		if(a%2 == 0) {
			System.out.println("This number is even");
		} else {
			System.out.println("This number is odd");
		}
		
	}

}
