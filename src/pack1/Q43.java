package pack1;

import java.util.Scanner;

public class Q43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner (System.in);
		System.out.println("What's the base? ");
		int num = kb.nextInt();
		kb.close();
		
		int count = num;
		int square = 0;
		
		do {
			square = num * num;
			count--;
		}
		while (count == num);
		System.out.println(square);
	}

}
