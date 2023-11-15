package pack1;

import java.util.Scanner;

public class Q89 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);
        System.out.println("Please enter the amount of number you will enter: ");
        int num = kb.nextInt();
        kb.close();
        
        for (int i = 1; i<=10;i++) {
        	int mult = 1 * num;
        	System.out.println(num + " x " + i + " = " + mult);        	
        }
				
	}
	

}
