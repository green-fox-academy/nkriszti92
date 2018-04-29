package week02.day01;

import java.util.Scanner;

public class DrawPyramid {
    // Write a program that reads a number from the standard input, then draws a
// pyramid like this:
//
//
//    *
//   ***
//  *****
// *******
//
// The pyramid should have as many lines as the number was

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Add an integer! ");

        int rows = scanner.nextInt();
        int temp = rows;

        for (int i = 1; i <= rows; i++) {
            for (int c = 1; c < temp; c++)
                System.out.print(" ");
                temp--;

            for (int c = 1; c <= 2 * i - 1; c++)
                System.out.print("*");
                System.out.println("");
        }


    }
}
