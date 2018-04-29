package week02.day01;

import java.util.Scanner;

public class OddEven {
// Write a program that reads a number from the standard input,
// Then prints "Odd" if the number is odd, or "Even" if it is even.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Add an integer! ");
        int num = scanner.nextInt();
        int odd = num % 2;

        if (odd == 0){
            System.out.println("Even");
        } else System.out.println("Odd");


    }

}
