package week03.day02;

public class Sum {
//  Create the usual class wrapper and main method on your own.

// - Write a function called `sum` that sum all the numbers
//   until the given parameter and returns with an integer

    public static void main(String[] args) {
        int sumNumber = 5;
        System.out.println(sum(sumNumber));
    }

    public static int sum (int number){
        int numbers = 0;
        for (int i = 0; i < number; i++) {
            numbers = numbers + i;

        }
        return numbers;
    }
}
