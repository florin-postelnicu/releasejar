package com.exercises.javaprograms;

import javax.swing.JOptionPane;

public class InputDialogDemo {
    public static void main(String[] args) {
        String name;

        // Get user's name
        name = JOptionPane.showInputDialog("What's your name?  ");

        // display message
        JOptionPane.showInputDialog(null, "Hello" + name);
    }
}
