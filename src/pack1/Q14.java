package pack1;

import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);
		System.out.println("Input the word: ");
		String word1 = kb.nextLine();
		String word2 = kb.nextLine();
		kb.close();
		
		int len1 = word1.length();
		int len2 = word2.length();
		int len = 0;
		
		int count = 0;
		
		if (len1>len2) {
			len = len1;
		}else {
			len = len2;
		}
		
		for (int i = 0; i < len ; i++) {
			if (word1.charAt(i) == word2.charAt(i)) {
				count++;
			}
		}	
		if (count == len) {
			System.out.println("The words are the same");
		} else {
			System.out.println("The words are not the same");
		}
		
		
		
		if (word1.equals(word2)) {
			System.out.println("The words are the same");
		} else {
			System.out.println("The words are not the same");

		}
		
	}

}
