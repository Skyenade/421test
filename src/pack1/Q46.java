package pack1;

import java.util.Scanner;

public class Q46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner (System.in);
		System.out.println("Please enter a number: ");
		int num = kb.nextInt();
		kb.close();
				
		for (int count = 1;count<=num;count++) {
			System.out.println(num + " * " + count + " = " + count *num);

		}
		
	}

}
