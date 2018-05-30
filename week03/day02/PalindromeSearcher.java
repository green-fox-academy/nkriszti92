package week03.day02;

import java.util.ArrayList;
import java.util.Scanner;

public class PalindromeSearcher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me some words!");
        String inputWords = scanner.nextLine();

        System.out.println(palindromeSearch(inputWords));
    }

    private static ArrayList<String> palindromeSearch(String inputWords) {
        char[] words = inputWords.toLowerCase().toCharArray();
        ArrayList<String> palindromes = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            for (int j = words.length - 1; j > i + 1; j--) {
                String word = "";

                for (int k = i; k <= j; k++) {
                    word += words[k];
                }

                String reversedWord = new StringBuilder(word).reverse().toString();

                if (word.equals(reversedWord)) {
                    palindromes.add(word);
                }
            }
        }

        return palindromes;

    }
}
