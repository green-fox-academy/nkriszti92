package week02.day01;

import java.util.Scanner;

public class AverageOfInput {
    // Write a program that asks for 5 integers in a row,
    // then it should print the sum and the average of these numbers like:
    //
    // Sum: 22, Average: 4.4

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Add an integer! ");
        int num1 = scanner.nextInt();

        System.out.println("Add another integer! ");
        int num2 = scanner.nextInt();

        System.out.println("Add another integer! ");
        int num3 = scanner.nextInt();

        System.out.println("Add another integer! ");
        int num4 = scanner.nextInt();

        System.out.println("Add another integer! ");
        int num5 = scanner.nextInt();

        int sum = num1 + num2 + num3 + num4 + num5;
        double av =  (num1 + num2 + num3 + num4 + num5)/5;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + av);
    }
}
