import java.util.Scanner;

public class GuessTheNumber {
    // Write a program that stores a number, and the user has to figure it out.
// The user can input guesses, after each guess the program would tell one
// of the following:
//
// The stored number is higher
// The stried number is lower
// You found the number: 8


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Add an integer! ");
        long num = scanner.nextLong();
        int stored = 8;

        if (num < stored) {
            System.out.println("The stored number is higher");
        }

        if (num > stored) {
            System.out.println("The stored number is lower");
        }

        if (num == stored) {
            System.out.println("You found the number: 8");
        }

    }
}
