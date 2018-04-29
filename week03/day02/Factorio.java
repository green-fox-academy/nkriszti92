package week03.day02;

public class Factorio {
    //  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `factorio`
//   that returns it's input's factorial


    public static void main(String[] args) {
        int factNumber = 5;
        System.out.println(factorio(factNumber));
    }

    public static int factorio (int number){
        int numbers = 1;
        for (int i = 1; i <= number; i++) {
            numbers = numbers * i;

        }
        return numbers;
    }
}
