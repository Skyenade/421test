package pack1;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Input a number: ");
		double a = kb.nextInt();
		double b = kb.nextInt();
		double c = kb.nextInt();
		kb.close();
		
		int count = 3;
		double average = (a+b+c)/count;
		
		System.out.println("The average is " + average);
		
	}

}
