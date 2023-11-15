package pack1;

import java.util.Scanner;

public class Q22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);
		System.out.println("Input the numbers: ");
		double a = kb.nextInt();
		double b = kb.nextInt();
		double c = kb.nextInt();
		kb.close();
		
		double delta = (b*b) - 4*a*c;
		if (delta >0) {
			double root1 = (-b + Math.sqrt(delta))/(2*a);
			double root2 = (-b - Math.sqrt(delta))/(2*a);
			System.out.println("Root 1 is " + root1);
			System.out.println("Root 2 is " + root2);
		} else if (delta ==0){
			double roots = -b/(2*a);
			System.out.println("Root 1 is " + roots);
		} else {
			System.out.println("You don't have a root");
		}
		
		myquadmethod(a,b,c);
	}
	
	public static void myquadmethod(double a, double b, double c) {
		double d = (b*b) - 4*a*c;
		if (d >0) {
			double root1 = (-b + Math.sqrt(d))/(2*a);
			double root2 = (-b - Math.sqrt(d))/(2*a);
			System.out.println("Root 1 is " + root1);
			System.out.println("Root 2 is " + root2);
		} else if (d ==0){
			double roots = -b/(2*a);
			System.out.println("Root 1 is " + roots);
		} else {
			System.out.println("You don't have a root");
		}
		
	}

}
