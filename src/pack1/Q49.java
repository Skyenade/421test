package nov11;

import java.util.Scanner;

public class Q49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb =  new Scanner(System.in);
		System.out.println("Please anter the array element: ");
		int number = kb.nextInt();
		kb.close();
		int[]arr = {1,2,3,4,5,6,7,8,9};
		int index = 0;
		for(int i = 0; i < arr.length; i++) {
			if (arr[i] == number) {
				index = i;
			}
		}
		System.out.println("The index of " + number + " is: " + index);
		
	}

}
