package pack1;

import java.util.Scanner;

public class Q86 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int num = kb.nextInt();
		kb.close();
		
		int add = seriesSum(num);
		System.out.println(add);
		
	}
	
	public static int seriesSum(int num) {
		int sum = 0;
		int currentnumber = 0;
		
		for (int i = 0; i<num; i++) {
			currentnumber = currentnumber *10 +1;
			sum += currentnumber;
		}
		
		return sum;
	}

}
