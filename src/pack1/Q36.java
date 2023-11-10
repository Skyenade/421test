package pack1;

import java.util.Scanner;

public class Q36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner (System.in);
		System.out.println("What's the base? ");
		int base = kb.nextInt();
		kb.close();
		
		int count = base;
		int square = 0;
		
		while (count == base) {
			square = base * base;
			count--;
		}
		System.out.println(square);
		
		while (count < base) {
			square += base;
			count++;
		}
	}

}
