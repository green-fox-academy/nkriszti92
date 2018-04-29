public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables

        int hoursInSec = currentHours * 60 * 60;
        int minutesInSec = currentMinutes * 60;
        int allSec = 24 * 60 * 60;
        int pastSecs = hoursInSec + minutesInSec + currentSeconds;

        int remSecs = allSec - pastSecs;

        System.out.println("Remaining seconds: " + remSecs + " seconds");

    }
}