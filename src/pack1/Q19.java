package pack1;

import java.util.Scanner;

public class Q19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);
		System.out.println("Input the number: ");
		int num = kb.nextInt();
		kb.close();
				
		if (num > 0 && num%2 == 0) {
			System.out.println("The number is even and positive");
		} else if (num > 0 && num%2 == 1) {
			System.out.println("The number is positive but no even");
		} else if (num < 0 && num%2 == 0){
			System.out.println("The number is even but not positive");
		} else {
			System.out.println("The number is not even nor positive");
		}
		
	}

}
