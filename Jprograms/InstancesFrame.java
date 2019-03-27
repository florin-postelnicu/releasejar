package com.exam.bicycle;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class InstancesFrame extends Frame{
    InstancesFrame() {
        // Creating Frame
        Frame fr = new Frame();
        // Creating Label
        Label lb = new Label("User ID: ");

        // adding label to the frame
        fr.add(lb);

        // Creating Text Field
        TextField txt = new TextField();

        // adding txt to the frame
        fr.add(txt);

        // setting frame's size
        fr.setSize(500, 300);

        // Setting Layout for the frame
        fr.setLayout(new FlowLayout());

//        fr.addWindowListener(new WindowAdapter() {
//            @Override
//            public void windowOpened(WindowEvent e) {
//                super.windowOpened(e);
//            }
//        });


        fr.setVisible(true);}


        public static void main (String[] args){
            InstancesFrame inf = new InstancesFrame();
            inf.addWindowListener(new WindowAdapter() {

                public void windowClosed(WindowEvent e) {
                    super.windowClosed(e);
                }
            });



        }

    }