package pack1;

import java.util.Scanner;

public class Q87 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner (System.in);
		System.out.println("Please enter a grade: ");
		char grade = kb.next().charAt(0);
		kb.close();
		
		String desc = gradedescription(grade);
		
		System.out.println(desc);
		
	}
	
	public static String gradedescription(int score) {
		String description = null;
		switch (score) {
			case 'E':
			case 'e':
				description = "Excelent";
				break;
			case 'V':
			case 'v':
				description = "Very Good";
				break;
			case 'G':
			case 'g':
				description = "Good";
				break;
			case 'A':
			case 'a':
				description = "Average";
				break;
			case 'F':
			case 'f':
				description = "Fail";
				break;
			default:
				description = "Not a valid grade";
				break;
		}
		return description;
	}

}
