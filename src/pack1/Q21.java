package pack1;

import java.util.Scanner;

public class Q21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);
		System.out.println("Input the numbers: ");
		int num = kb.nextInt();
		kb.close();
		
		if (num%3 == 0 && num%5 == 0) {
			System.out.println("The number is multiple of 3 and 5");
		} else if (num%3 == 0 && num%5 == 1) {
			System.out.println("The number is multiple of 3 but not of 5");
		} else if (num%3 == 1 && num%5 == 0){
			System.out.println("The number is multiple of 5 but not of 3");
		} else {
			System.out.println("The number is not multiple of 3 or 5");
		}
		
	}

}
