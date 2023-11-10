package pack1;

import java.util.Scanner;

public class Q48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner (System.in);
		System.out.println("Please add a number");
		double number = kb.nextDouble();
		kb.close();
		
		double [] arr = {1,5,6,12.5,56};
		
		for (int i = 0;i<arr.length;i++) {
			if (arr[i] == number) {
				System.out.println("The number " + number + " is in the  array");
			} else {
				System.out.println("The number" + number + " is not in the array");
			}
		}
		
	}

}
