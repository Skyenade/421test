package pack1;

import java.util.Scanner;

public class Q28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner (System.in);
		System.out.println("Please give me a character: ");
		char mychar = kb.next().charAt(0);
		kb.close();
		char lowmychar = Character.toLowerCase(mychar);
		
		switch(lowmychar) {
		case 'a':
			System.out.println("Is a vowel");
			break;
		case 'e':
			System.out.println("Is a vowel");
			break;
		case 'i':
			System.out.println("Is a vowel");
			break;
		case 'o':
			System.out.println("Is a vowel");
			break;
		case 'u':
			System.out.println("Is a vowel");
			break;
		default:
			System.out.println("Is a consonant.");
			break;

		}
		

	}

}
