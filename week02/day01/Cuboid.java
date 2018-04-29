package week02.day01;

import java.text.DecimalFormat;

public class Cuboid {
    // Write a program that stores 3 sides of a cuboid as variables (doubles)
// The program should write the surface area and volume of the cuboid like:
//
// Surface Area: 600
// Volume: 1000}
    public static void main(String[] args) {

        double x = 10;
        double y = 15;
        double z = 12;
        double surface = 2 * (x * y + x * z + y * z);
        double volume = x * y * z;

        DecimalFormat df = new DecimalFormat("###");

        System.out.println("Surface Area: " + df.format(surface));
        System.out.println("Volume: " + df.format(volume));
    }
}