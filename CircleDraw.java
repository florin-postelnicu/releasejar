package com.exam.bicycle;
// awt = Abstract Window Toolkit

import java.awt.*;
import  java.awt.event.*;
import java.awt.geom.*;

public class CircleDraw extends Frame{
    Shape circle = new Ellipse2D.Float(100.0f, 100.0f, 100.0f, 100.0f);
    Shape square = new Rectangle2D.Double(100, 100, 100, 100);
    Shape ellipse = new Ellipse2D.Float(200.0f, 100.0f, 150.0f, 50.0f) ;
    Shape rectangle = new Rectangle2D.Double(350, 100, 50, 200);
    public void paint( Graphics g){
        Graphics2D ga = (Graphics2D)g;
        ga.draw(circle);
        ga.setPaint(Color.green);
        ga.fill(circle);
        ga.setPaint(Color.red);
        ga.draw(square);
        ga.setPaint(Color.yellow);
        ga.draw(ellipse);
        ga.fill(ellipse);
        ga.setPaint(Color.blue);
        ga.draw(rectangle);
        ga.fill(rectangle);
    }

    public static void main(String[] args) {
        Frame frame = new CircleDraw();
        frame.addWindowListener(new WindowAdapter() {
            public  void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });
        frame.setSize(700, 500);
        frame.setVisible(true);



    }
}