package pack1;

import java.util.Scanner;

public class Q34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner (System.in);
		System.out.println("Please enter a number: ");
		int num = kb.nextInt();
		kb.close();
		
		// for 1 number
		int count = 1;		
		while(count <= num){
			System.out.println(num + " * " + count + " = " + count *num);
			count++;
		}
		
		// full table
		int i = 1;
		while (i<10) {
			int j = 1;
			while(j<10) {
				System.out.println(i*j + " ");
			}
			System.out.println();
			i++;
		}
	}

}
