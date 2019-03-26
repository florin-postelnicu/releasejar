package com.exam.bicycle;
import java.awt.*;

public class SimpleExample  extends Frame{
    SimpleExample(){

        Button b = new Button("Button!");

        // setting button position on screen
        b.setBounds(50,50, 50, 50);

        // adding button b into frame
        add(b);

        // setting Frame width and Height
        setSize(500, 300);

        //setting the title of the Frame
        setTitle("AWT Window Example 1");

        // Setting the layout for the Frame
        setLayout(new FlowLayout());

        /* By default the frame is not visible so
        * we are setting the visibility to true
        * to make it visible
         */
        setVisible(true);
    }

    public static void main(String[] args) {
        SimpleExample fr = new SimpleExample();
    }
}
