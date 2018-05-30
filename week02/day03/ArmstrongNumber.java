package week02.day03;

import static java.lang.Math.pow;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give a number: ");
        int num = scanner.nextInt();
        double total = 0;

        int lengthOfNumber = String.valueOf(num).length();

        for (int i = 0; i < lengthOfNumber; i++) {
            double doubleValue = Double.parseDouble(String.valueOf(String.valueOf(num).charAt(i)));
            total = total + pow(doubleValue, lengthOfNumber);
        }

        if (total == num)
            System.out.println("The " + num + " is an Armstrong number");
        else
            System.out.println("The " + num + " is not an Armstrong number");
    }
}
