package pack1;

import java.util.Scanner;

public class Q26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);
		System.out.println("Input the value: ");
		double purchase = kb.nextDouble();
		System.out.println("Input the discount: ");
		double discount = kb.nextDouble();
		double total = 0;
		kb.close();
		
		discount /= 100;
		total = purchase - (purchase *discount);
		
		System.out.println("The total value is " + total);
		
	}

}
