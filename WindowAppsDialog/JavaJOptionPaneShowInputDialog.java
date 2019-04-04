package com.exercises.javaprograms;
import javax.swing.*;
/*
A variable assigned through name is reported to
the whole program by defining it as static and public variable,
and reassigning it inside the constructor
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
        System.out.println(JavaJOptionPaneShowInputDialog.name1);


    }



}
