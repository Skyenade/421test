package pack1;

import java.util.Scanner;

public class Q87 {

    public static void main(String[] args) {
        double count = 0;
        double sum = 0;
        double average = 0; // Move the declaration outside the loop

        Scanner kb = new Scanner(System.in);

        while (true) {
            System.out.println("Please enter a number: ");
            double num = kb.nextDouble();

            if (num > 0) {
                sum = sum + num;
                count += 1;
                average = sum / count;
            } else {
                break;
            }
        }

        kb.close(); // Close the Scanner after the loop
        System.out.println("Average: " + average);
    }
}