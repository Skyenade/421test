package pack1;

import java.util.Scanner;

public class Q87 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				
		double count = 0;
		double sum = 0;
		while (true){
			double average;
			Scanner kb = new Scanner (System.in);
			System.out.println("Please enter a number: ");
			double num = kb.nextDouble();
			if (num > 0) {
				sum = sum + num;
				count += 1;
				average = sum / count;
			} else {
				break;
			}
			kb.close();
			System.out.println(average);
		}
			
	}

}
