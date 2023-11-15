package pack1;

import java.util.Scanner;

public class Q28 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char inputChar = kb.next().charAt(0);

        switch (Character.toLowerCase(inputChar)) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(inputChar + " is a vowel.");
                break;
            default:
                System.out.println(inputChar + " is a consonant.");
        }
    }
}
