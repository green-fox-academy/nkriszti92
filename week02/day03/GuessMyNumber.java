package week02.day03;

import java.util.Scanner;

public class GuessMyNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please add the guessing range, the min values is: ");
        int minValue = scanner.nextInt();
        System.out.println("The max values is: ");
        int maxValue = scanner.nextInt();

        int solution = minValue + (int) (Math.random() * ((maxValue - minValue) + 1));
        int numberOfLives = 5;
        int actLives = numberOfLives;

        System.out.println("I've the number between " + minValue + " - " + maxValue + ". You have " + numberOfLives + " lives.");
        int guess = scanner.nextInt();

        for (int i = 0; i < numberOfLives; i++) {
            if (guess == solution) {
                System.out.println("Wow, congratulations. You won!");
                break;
            }

            if (guess > solution) {
                actLives -= 1;
                System.out.println("Too high. You have " + actLives + " lives left.");
            }

            if (guess < solution) {
                actLives -= 1;
                System.out.println("Too low. You have " + actLives + " lives left.");
            }

            if (actLives == 0) {
                System.out.println("Oh no, you are dead! :(");
                System.out.println("\nThe correct answer is: " + solution);
                break;

            } else {
                System.out.println("Try a new number!");
                guess = scanner.nextInt();
            }
        }
    }
}
