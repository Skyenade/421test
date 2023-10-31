package pack1;

import java.util.Scanner;

public class Q15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);
		System.out.println("Input the numbers: ");
		int num1 = kb.nextInt();
		int num2 = kb.nextInt();
		int num3 = kb.nextInt();
		int num4 = kb.nextInt();
		kb.close();
		int max = 0;
		
		if (num1>num2 && num1>num3 && num1 > num4) {
			max = num1;
		} else if (num2>num3 && num2 > num4){
			max = num2;
		} else if (num3 > num4){
			max = num3;
		} else {
			max = num4;
		}
		
		System.out.println("The number " + max + " is the largest  number" );

		
	}

}
