package week02.day01;

import java.util.Scanner;

public class DrawDiamond {
    // Write a program that reads a number from the standard input, then draws a
// diamond like this:
//
//
//    *
//   ***
//  *****
// *******
//  *****
//   ***
//    *
//
// The diamond should have as many lines as the number was

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Add an odd number! ");

        int rows = scanner.nextInt();
        int temp = rows;
        int frows = (rows + 1) / 2;
        int frows2 = rows - frows;
        int temp2 = frows;


        for (int i = 1; i <= frows; i++) {
            for (int c = 1; c < temp; c++)
                System.out.print(" ");
            temp--;

            for (int c = 1; c <= 2 * i - 1; c++)
                System.out.print("*");
            System.out.println("");
        }

        for (int i = frows2; i >= 1; i--) {
            for (int c = 1; c < temp2+1; c++)
                System.out.print(" ");
            temp2++;

            for (int k = 1; k < (i * 2); k++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    }




