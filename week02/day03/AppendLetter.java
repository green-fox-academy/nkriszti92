package week02.day03;

import java.util.*;

public class AppendLetter{
    public static void main(String... args){
        List<String> far = Arrays.asList("kuty", "macsk", "kacs", "rók", "halacsk");
        // Create a method called "appendA()" that adds "a" to every string in the "far" list.
        // The parameter should be a list.

        System.out.println(appendA(far));
    }
    public static List appendA(List<String> animals) {
        for (int i = 0; i < animals.size(); i++) {
            animals.set(i, animals.get(i) + "a");
        }
        return animals;
    }
}


// The output should be: "kutya", "macska", "kacsa", "róka", "halacska"