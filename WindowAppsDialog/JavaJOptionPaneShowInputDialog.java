package com.exercises.javaprograms;
import javax.swing.*;
/*
A variable assigned through name is reported to
the whole program by defining it as static and public variable,
and reassigning it inside the constructor
The static keyword denotes that a member variable, or method,
can be accessed without requiring an instantiation of the class to which it belongs.
In simple terms, it means that you can call a method, even if you've never created the object to which it belongs!
 */

public class JavaJOptionPaneShowInputDialog {
    JFrame f;
    public static  String name1;


    JavaJOptionPaneShowInputDialog(){
        f = new JFrame();
        String name = JOptionPane.showInputDialog(f, "What's ur name brogh?");
        System.out.println(name);
        name1 = name;






    }

    public static void main(String[] args) {
        new JavaJOptionPaneShowInputDialog();
        System.out.println(name1);


    }



}
