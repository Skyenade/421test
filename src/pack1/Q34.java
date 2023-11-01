package pack1;

import java.util.Scanner;

public class Q34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);
		System.out.println("Input a number: ");
		int num = kb.nextInt();
		kb.close();
		int i = 1;

		while (i <= num) {
			System.out.println(i + " * " + num + " = " + i * num);
			i++;
		}
		
	}

}
