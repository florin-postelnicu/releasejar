package IntroJavaSwing01;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class Window01  implements ActionListener{
    // implement the interface

    JButton  button;

    public static void main(String[] args) {
        Window01 win01 = new Window01();
        win01.go();


    }
    public void go() {
        JFrame frame = new JFrame();
        button = new JButton("Don't Touch This");

        button.addActionListener(this); // register (add the button to the list of listeners)

        frame.getContentPane().add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);


    }

    public void actionPerformed(ActionEvent event) {
        button.setText("I've been touched by an angel");
        button.setBackground(Color.yellow);
        button.getForeground();
        // Implement the ActionLListener interface's actionPerformed() method
        // This is the actual event -handling method
    }
}
