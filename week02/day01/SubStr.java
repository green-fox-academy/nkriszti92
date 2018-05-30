package week02.day01;

import java.util.Scanner;

public class SubStr {
    public static void main(String[] args) {
        //  Create a function that takes two strings as a parameter
        //  Returns the starting index where the second one is starting in the first one
        //  Returns `-1` if the second string is not in the first one
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a sentence");
        String input = scanner.nextLine();
        System.out.println("Give me a word");
        String q = scanner.nextLine();

        subStr(input, q);
    }

    public static int subStr(String input, String q) {
        if (input.contains(q)) {
            int indexOfFirstChar = input.indexOf(q);
            System.out.println(indexOfFirstChar);
            return indexOfFirstChar;
        } else {
            System.out.println("-1");
            return -1;
        }
    }
}