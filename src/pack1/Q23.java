package pack1;

import java.util.Scanner;

public class Q23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);
		System.out.println("Input a number: ");
		int a = kb.nextInt();
		kb.close();
		
		String day;
		
		switch (a){
		case(1):
			day = "Sunday";
			break;
		case(2):
			day = "Monday";
			break;
		case(3):
			day = "Tuesday";
			break;
		case(4):
			day = "Wednesday";
			break;
		case(5):
			day = "Thursday";
			break;
		case(6):
			day = "Friday";
			break;
		case(7):
			day = "Saturday";
			break;
		default:
			day = "Not defined";
			break;
		}
		System.out.println("Based on your number the day is " + day);
		
	}

}
