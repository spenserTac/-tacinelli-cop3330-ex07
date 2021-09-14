/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Spenser Tacinelli
 */

import java.util.Scanner;

public class Exercise_7{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the length of the room in feet? ");
        String length = scanner.nextLine();

        System.out.print("What is the width of the room in feet? ");
        String width = scanner.nextLine();

        System.out.println("You entered dimensions of " + length + " feet by " + width +  "feet.");
        System.out.println("The are is");
        int length_i = Integer.parseInt(length);
        int width_i = Integer.parseInt(width);
        double area = length_i * width_i;

        System.out.println(area + " square feet");
        final double length_m = (length_i * length_i) * 0.09290304;
        final double width_m = (width_i * width_i) * 0.09290304;

        double length_mm = Math.sqrt(length_m);
        double width_mm = Math.sqrt(width_m);

        double area_meters = length_mm * width_mm;

        System.out.println(area_meters + " square meters");
    }
}