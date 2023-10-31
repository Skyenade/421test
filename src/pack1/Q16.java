package pack1;

import java.util.Scanner;

public class Q16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Input the numbers: ");
		int num1 = kb.nextInt();
		kb.close();
		double sqr,floor;
		
		sqr = Math.sqrt(num1);
		floor = Math.floor(sqr);
		
		if (sqr - floor == 0) {
			System.out.println("Is a perfect square");
		} else {
			System.out.println("Not a perfect square");
		}
		
	}

}
