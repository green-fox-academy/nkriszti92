package week02.day01;

import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it

        Scanner scanner = new Scanner(System.in);
        System.out.println("Add an integer!");

        int distance = scanner.nextInt();
        double distInMiles = distance * 0.621;

        System.out.println(distance + " kilometers = " + distInMiles + " miles");


    }
}