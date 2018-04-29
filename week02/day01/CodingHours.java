package week02.day01;

import java.text.DecimalFormat;

public class CodingHours {
    public static void main(String[] args) {
        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        //
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        //
        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52

        int dailyHours = 6;
        int semesterWeeks = 17;
        int workDays = 5;
        int weeklyWorkHours = 52;

        double spentWithCodeing = dailyHours * semesterWeeks * workDays;
        double fullWorkHours = weeklyWorkHours * semesterWeeks;
        double percent = spentWithCodeing/fullWorkHours * 100;

        DecimalFormat df = new DecimalFormat("###");

        System.out.println("Hours are spent with coding: " + df.format(spentWithCodeing));
        System.out.println("Percentage of the coding hours in the semester: " + df.format(percent) + "%");


    }
}