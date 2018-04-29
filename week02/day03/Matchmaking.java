package week02.day03;

import java.util.*;

public class Matchmaking {
    public static void main(String... args) {
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve", "Ashley", "Bözsi", "Kat", "Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe", "Fred", "Béla", "Todd", "Neef", "Jeff"));

        // Write a method that joins the two lists by matching one girl with one boy into a new list
        // Exepected output: "Eve", "Joe", "Ashley", "Fred"...

        System.out.println(makingMatches(girls, boys));
    }

    public static ArrayList makingMatches(ArrayList<String> girls, ArrayList<String> boys) {
        ArrayList<String> boysGirls = new ArrayList<String>(Arrays.asList());
        for (int i = 0; i < girls.size(); i++) {
        boysGirls.add(girls.get(i));
        boysGirls.add(boys.get(i));
        }
        return boysGirls;

    }
}