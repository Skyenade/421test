package pack1;

import java.util.Scanner;

public class Q33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);
		System.out.println("Input a number: ");
		int n = kb.nextInt();
		kb.close();
		
		int num = String.valueOf(n).length();
		int i = 0;
		
		while (i <= num) {
			System.out.print(index(i));
			i++;
		}
		
	}

	private static char[] index(int n) {
		// TODO Auto-generated method stub
		
		return null;
	}

}
