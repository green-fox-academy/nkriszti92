package week03.day02;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a word!");
        String firstWord = scanner.nextLine();

        createPalindrome(firstWord);
    }

    public static void createPalindrome(String word) {
        char[] word1 = word.toLowerCase().toCharArray();
        System.out.print(word);

        for (int i = word.length() - 1; i >= 0; i--) {
            System.out.print(word1[i]);
        }
    }
}
