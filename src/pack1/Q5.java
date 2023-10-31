package pack1;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);
		System.out.println("Input a number: ");
		double num = kb.nextDouble();
		double absnum;
		kb.close();
		
		if (num < 0) {
			absnum = (-1) * num;
		} else {
			absnum = num;
		}
		System.out.println("Absolute number is" + absnum);

	}

}
