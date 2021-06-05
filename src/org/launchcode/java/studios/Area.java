package org.launchcode.java.studios;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner radius = new Scanner(System.in);   //Create Scanner Object
        System.out.println("What is the radius?");  //output for user
        int radius1 = radius.nextInt();//read user input

        if (radius1 <= 0) {
            System.out.println("No negative numbers allowed");
        } else {
            double area = 3.14 * radius1 * radius1;   //calculate area
            System.out.println("The area of the circle with a radius of " + radius1 + " is " + area);
        }

    }
}
