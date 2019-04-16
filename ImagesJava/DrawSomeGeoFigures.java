package IntroJavaSwing01;

import javax.swing.*;
import java.awt.*;

public class DrawSomeGeoFigures {

    public static void main(String[] args) {
        MyPanel panel = new MyPanel();

        // Create a basic JFrame
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Some Geometric Figures");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add panel to the main frame
        frame.add(panel);

        frame.setVisible(true);

    }
}
// Create a panel that you can draw on

class MyPanel extends JPanel {
    public void paint(Graphics g){
        // fill a rectangle
        g.setColor(Color.yellow);
        g.fillRect(10, 10, 100, 100);
        //fil an oval-cercle
        g.setColor(Color.blue);
        g.fillOval(105, 105, 100, 100);
        // fill a rectangle(3D?)
        g.setColor(Color.red);
        g.fill3DRect(300, 300,100, 100, true);
        g.setColor(Color.orange);

        //Define the corners of a polygon, and fill it
        int xpoints[] = {25, 55, 155, 245,325};
        int ypoints[] = {325, 270, 225, 225,450};
        int npoints = 5;

        g.fillPolygon(xpoints, ypoints, npoints);
    }
}