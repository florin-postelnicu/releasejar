package com.examples.hello;

import java.util.Scanner; // Needed for Scanner classes

public class ReadConsoleInput
{
    // will be determining the area of a rectangel,
    // by entering the length and width

    public static void main(String[] args) {
        int length; // To hold rectangle's length
        int width;  //To hold rectangle's width
        int area;  //To hold the are

        String name;
        String line;


        // Create a Scanner object to read input

        Scanner console = new Scanner(System.in);

        // Get length from the user
        System.out.println("Enter Length  ");
        length = console.nextInt();

        // Get width from user
        System.out.println("Enter  Width  ");
        width = console.nextInt();

        // Get name
        System.out.println("Enter your Name Traveler  ");
        name = console.nextLine();

        // Get the next Line
        System.out.println("Tell us your story " );
        line = console.nextLine();

        // Calcultae area

        System.out.println(" Here is my story falks ...." + "\n" + line);
        area = length * width;
        System.out.println("The Area of rectangle is " + area);
        System.out.println("Traveler's Name  " + name);

    }

}
