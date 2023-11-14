package pack1;

import java.util.Scanner;

public class Q85 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int num = kb.nextInt();
		kb.close();
		
		System.out.println("Input number is " + num);
		
		cube(num);		
	}
	
	public static void cube(int num) {
				
		for (int i = 1; i<=num; i++) {
			int cubic = i * i * i;
			System.out.println("Number is " + i + " and cube of " + i + " is " + cubic);
		}
		
	}

}
