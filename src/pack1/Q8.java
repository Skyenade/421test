package pack1;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);
		System.out.println("Input the number: ");
		int num = kb.nextInt();
		kb.close();
		
		if (num<0) {
			System.out.println("I can't do it");

		} else {
			System.out.println("The square root of " + num + " is "+ Math.sqrt(num));
		}
		
	}

}
