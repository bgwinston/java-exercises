package org.launchcode.java.studios;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner radius= new Scanner(System.in);
        System.out.println("What is the radius?");
        int radius1= radius.nextInt();
        double area= 3.14 * radius1 *radius1;
        System.out.println("The area of the circle with a radius of " + radius1 + " is " + area);
    }
}
