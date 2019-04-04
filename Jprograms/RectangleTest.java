package com.exercises.javaprograms;

import javax.swing.*;

public class RectangleTest {
    public static void main(String[] args) {
        String input; // To hold string input
        int length;
        int width;
        int area;


        // Prompt user to input length
        input = JOptionPane.showInputDialog("Enter Length ");

        // Convert the String input to an int
        length = Integer.parseInt(input);

        // Prompt user to input width
        input = JOptionPane.showInputDialog("Enter Width");

        // Convert the String width to an int
        width = Integer.parseInt(input);
        // Calculate Area of the Rectangle
        area = length*width;

        // Prompt user to input the Name
        input = JOptionPane.showInputDialog("Enter your Name");

        // Display the data accumulated
        JOptionPane.showMessageDialog(null, input + " Your Area is :" + area);

    }
}
