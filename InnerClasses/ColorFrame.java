/*
Inner classes, anonymous inner classes, and lambda expressions are among the most complex
parts of the Java language to learn. They appeal primarily to programmers who have been
writing programs in the language for a while and can take advantage of powerful features to
accomplish more in fewer lines of code.
But even before you reach a point where you’re writing your own lambda expressions, you
should be able to benefit from the use of inner classes and anonymous inner classes.
A non-anonymous inner class is structured like a separate helper class, but it’s placed inside
another class alongside the instance variables, class variables, instance methods, and class
methods. Unlike a helper class, it can access the private variables and methods of the class that
it is created inside.
An anonymous inner class removes the need to devote an object to a class that’s only used once,
such as an event listener attached to a user interface component in Swing.
Lambda expressions are deceptively similar in appearance, requiring only a new arrow operator
-> to create. But the implications of what they enable a Java programmer to do are enormous.
Programmers with experience in other languages have been clamoring for this functionality for
years.
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class ColorFrame extends JFrame {
    JButton red, green, blue, yellow;

    public ColorFrame() {
        super("ColorFrame");
        setSize(322, 122);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout flo = new FlowLayout();
        setLayout(flo);
        red = new JButton("Red");
        add(red);
        green = new JButton("Green");
        add(green);
        blue = new JButton("Blue");
        add(blue);
        yellow = new JButton("Yellow");
        add(yellow);

        //Begin Anonymous Inner Class
        // Anonymous inner classes have access to the methods and instance variables of their
        //enclosing class. A separate helper class would not.

        ActionListener act = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                if (event.getSource() == red) {
                    getContentPane().setBackground(Color.RED);
                }
                if (event.getSource() == green) {
                    getContentPane().setBackground(Color.GREEN);

                }
                if (event.getSource() == blue) {
                    getContentPane().setBackground(Color.BLUE);

                }
                if (event.getSource() == yellow ){
                    getContentPane().setBackground(Color.YELLOW);
                }

            }
        };
        // end the anonymous inner class
        red.addActionListener(act);
        green.addActionListener(act);
        blue.addActionListener(act);
        yellow.addActionListener(act);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ColorFrame();
    }
}

