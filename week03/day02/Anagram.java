package week03.day02;

import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me a word!");
        String firstWord = scanner.nextLine();

        System.out.println("Give me another word!");
        String secondWord = scanner.nextLine();

        System.out.println(isAnagram(firstWord, secondWord));
    }

    public static boolean isAnagram(String firstWord, String secondWord) {
        if (firstWord == null || secondWord == null || firstWord.length() != secondWord.length()) {
            return false;
        }
        char[] word1 = firstWord.toLowerCase().toCharArray();
        char[] word2 = secondWord.toLowerCase().toCharArray();

        int firstWordCount = 0;
        int secondWordCount = 0;

        for (int i = 0; i < firstWord.length(); i++) {
            firstWordCount += word1[i];
            secondWordCount += word2[i];
        }

        if (firstWordCount == secondWordCount) {
            return true;
        } else
            return false;
    }
}
