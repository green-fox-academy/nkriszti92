package week02.day01;

import java.util.Scanner;
// Write a program that reads a number from the standard input, then draws a
// triangle like this:
//
// *
// **
// ***
// ****
//
// The triangle should have as many lines as the number was

public class DrawTriangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Add an integer! ");
        int num = scanner.nextInt();
        String star = "*";

        for (int i = 0; i < num; i++){
            System.out.println(star);
            star = star + "*";

        }
    }
}
