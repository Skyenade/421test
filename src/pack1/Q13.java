package pack1;

import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);
		System.out.println("Input the year: ");
		int year = kb.nextInt();
		kb.close();
		
		if (year%4 == 0 || year%100 == 1 && year%400 == 0) {
			System.out.println("This is a leap year");
		} else {
			System.out.println("This is not a leap year");
		}
		
	}

}
