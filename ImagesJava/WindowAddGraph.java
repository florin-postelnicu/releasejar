package IntroJavaSwing01;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class WindowAddGraph  implements ActionListener {
    JFrame frame;

    public static void main(String[] args) {
        WindowAddGraph mygraf = new WindowAddGraph();
        mygraf.go();
    }
    public void go() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Change colors");
        button.addActionListener(this);

        MyDrawPanel drawPanel = new MyDrawPanel();

        frame.getContentPane().add(BorderLayout.SOUTH, button);
        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent event){
        frame.repaint();
    }

class MyDrawPanel extends JPanel {

        public void paintComponent(Graphics g){
            Graphics2D g2d = (Graphics2D) g;

            int red = (int) (Math.random() * 256);
            int green = (int) (Math.random() * 2256);
            int blue = (int) (Math.random()*256);
            Color startColor = new Color(red, green, blue);

            red = (int) (Math.random()*256);
            green = (int) (Math.random()*256);
            blue = (int) (Math.random()*256);
            Color endColor = new Color(red, green, blue);

            GradientPaint gradient = new GradientPaint(70, 70, startColor, 150, 150, endColor);
            g2d.setPaint(gradient);
            g2d.fillOval(70, 70, 100, 100);

        }
}
    }