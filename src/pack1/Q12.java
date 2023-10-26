package pack1;

import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);
		System.out.println("Input the word: ");
		String word = kb.nextLine();
		kb.close();
		
		int size = word.length();
		
		for (int i = 0; i < size; i++) {
			if (word.charAt(i)== 'a' || word.charAt(i)== 'e' || word.charAt(i)== 'i' ||word.charAt(i)== 'o' || word.charAt(i)== 'u') {
				System.out.println(word.charAt(i) + " is a vowel");
			} else {
				System.out.println(word.charAt(i) + " is a consonant");
			}
			
		}		
		
	}

}
