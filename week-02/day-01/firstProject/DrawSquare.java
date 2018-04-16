import java.util.Scanner;

public class DrawSquare {
// Write a program that reads a number from the standard input, then draws a
// square like this:
//
//
// %%%%%
// %   %
// %   %
// %   %
// %   %
// %%%%%
//
// The square should have as many lines as the number was


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Add an integer! ");
        int rows = scanner.nextInt();


        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {

                if (i == 1 || i == rows)
                    System.out.print("%");
                else if (j == 1 || j == rows)
                    System.out.print("%");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}