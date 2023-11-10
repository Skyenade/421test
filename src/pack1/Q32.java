package pack1;

import java.util.Scanner;

public class Q32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner (System.in);
		System.out.println("Please a number: ");
		int fib = kb.nextInt();
		kb.close();
		
		int num1 = 0;
		int num2 = 1;
		int num3 = 0;
		int i = 0;
		
		System.out.println(num1);
		System.out.println(num2);

		while(i<fib-2) {
			num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
			i++;
			System.out.println(num3);
		}
		
	}

}
