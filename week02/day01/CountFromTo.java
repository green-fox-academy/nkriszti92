package week02.day01;

import java.util.Scanner;

public class CountFromTo {
    // Create a program that asks for two numbers
// If the second number is not bigger than the first one it should print:
// "The second number should be bigger"
//
// If it is bigger it should count from the first number to the second by one
//
// example:
//
// first number: 3, second number: 6, should print:
//
// 3
// 4
// 5


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Add an integer! ");
        int num1 = scanner.nextInt();

        System.out.println("Add another integer! ");
        int num2 = scanner.nextInt();

        if (num2 <= num1){
            System.out.println("The second number should be bigger!");

        }

        else
            while (num1 < num2) {
                System.out.println(num1);
                num1 += 1;
            }
    }
}
