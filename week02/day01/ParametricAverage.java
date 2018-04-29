package week02.day01;

import java.util.Scanner;

public class ParametricAverage {
// Write a program that asks for a number.
// It would ask this many times to enter an integer,
// if all the integers are entered, it should print the sum and average of these
// integers like:
//
// Sum: 22, Average: 4.4

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add an integer! ");
        int num = scanner.nextInt();
        int num2 = 0;

        for (int i = 0; i < num; i++) {
            System.out.println("Add an integer! ");
            int actnum = scanner.nextInt();
            num2 = num2 + actnum;
        }

        System.out.println("");
        System.out.println("Sum: " + num2 +", Average: " + (double)num2/num);





    }

}
