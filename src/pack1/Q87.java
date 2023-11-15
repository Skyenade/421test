package pack1;

import java.util.Scanner;

public class Q87 {

    public static void main(String[] args) {
        double count = 0;
        double sum = 0;
        double average = 0; 

        Scanner kb = new Scanner(System.in);
        System.out.println("Please enter the amount of number you will enter: ");
        int times = kb.nextInt();

        while (times > 0) {
            System.out.println("Please enter a number: ");
            double num = kb.nextDouble();

            if (num > 0) {
                sum = sum + num;
                count += 1;
                average = sum / count;
            } else {
                break;
            }
            times -= 1;
        }

        kb.close();
        System.out.println("Average: " + average);
    }
}
