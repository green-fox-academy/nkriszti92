package week03.day02;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        //  Create a function that takes a list of numbers as parameter
        //  Returns a list where the elements are sorted in ascending numerical order
        //  Make a second boolean parameter, if it's `True` sort that list descending

        //  Example:
        int[] numbers = {34, 12, 24, 9, 5};
        System.out.println("The ascending order: " + Arrays.toString(bubble(numbers)));
        System.out.println("The descending order: " + Arrays.toString(advancedBubble(numbers, true)));
    }

    public static int[] bubble(int[] numbers) {
        Arrays.sort(numbers);
        return numbers;
    }

    public static int[] advancedBubble(int[] numbers, boolean isItTrue) {
        Arrays.sort(numbers);
        int[] descList = new int[numbers.length];

        if (isItTrue) {
            for (int i = numbers.length - 1; i >= 0; ) {
                for (int j = 0; j < numbers.length; j++) {
                    descList[j] = numbers[i];
                    i--;
                }
            }
        }
        return descList;
    }
}
