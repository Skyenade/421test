package pack1;

import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);
		System.out.println("Input the numbers: ");
		int num1 = kb.nextInt();
		int num2 = kb.nextInt();
		int num3 = kb.nextInt();
		kb.close();
		int max = 0;
		
		if (num1>num2 && num1>num3) {
			max = num1;
		} else if (num2>num3){
			max = num2;
		} else {
			max = num3;
		}
		
		System.out.println("The number " + max + " is the largest  number" );

		
	}

}
