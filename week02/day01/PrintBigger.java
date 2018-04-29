package week02.day01;

import java.util.Scanner;

public class PrintBigger {
    // Write a program that asks for two numbers and prints the bigger one

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Add a number! ");
            int num1 = scanner.nextInt();

            System.out.println("Add another number! ");
            int num2 = scanner.nextInt();

            if (num1 > num2) {
                System.out.println("The bigger is: " + num1);
            } else System.out.println("The bigger is: " + num2);
        }

    }



