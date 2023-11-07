package nov11;

import java.util.Scanner;

public class Q26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner (System.in);
		System.out.println("Please enter the full amount: ");
		double totalamount = kb.nextDouble();
		kb.close();
		
		double discountamount = calDiscount(totalamount);
		
		System.out.println("Your discount is " + discountamount);
		
	}
	
	public static double calDiscount(double totalamount) {
		double discount = 0;
		if(totalamount > 1000) {
			discount = 0.1 * totalamount;
		} else if (totalamount > 500){
			discount = 0.05 * totalamount;
		} else {
			System.out.println("You don't have a discount");
		}
		return discount;
	}

}
