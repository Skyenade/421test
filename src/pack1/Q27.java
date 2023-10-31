package pack1;

import java.util.Scanner;

public class Q27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner kb = new Scanner (System.in);
		System.out.println("Please give me the month: ");
		String month = kb.nextLine();
		int days;
		kb.close();
		
		switch(month) {
		case "January":
			days = 31;
			break;
		case "February":
			days = 28;
			break;
		case "March":
			days = 31;
			break;
		case "April":
			days = 30;
			break;
		case "May":
			days = 31;
			break;
		case "June":
			days = 30;
			break;
		case "July":
			days = 31;
			break;
		case "August":
			days = 31;
			break;
		case "September":
			days = 30;
			break;
		case "October":
			days = 31;
			break;
		case "November":
			days = 30;
			break;
		case "December":
			days = 31;
			break;
		default:
			days = 0;
			break;
		}
		System.out.println("Based on the name the month there are " + days + " days");

	}

}
