package week03.day02;

public class PrintParams {
    //  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `printer`
//   which prints the input String parameters
// - It can have any number of parameters

// Examples
// printer("first")
// printer("first", "second")
// printer("first", "second", "third", "fourh")
// ...

    public static void main(String[] args) {
        printer("first", "second", "third", "fourth", "etcetera");
    }

    public static void printer(String... strings) {
        for (String s : strings) {
            System.out.print("\"" + s + "\" ");
        }
    }
}
