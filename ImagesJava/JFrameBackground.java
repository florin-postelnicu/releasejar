package IntroJavaSwing01;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class JFrameBackground implements ActionListener {
    JFrame frame;

    public static void main(String[] args) {

        JFrameBackground jfb = new  JFrameBackground();
        jfb.go();


    }
    public void go(){
        //Create a basic Jframe}

        JFrame.setDefaultLookAndFeelDecorated(true);
        frame = new JFrame("JFrame Color Example");

        JButton button = new JButton("Change Colors on Click");
        button.addActionListener(this);




        MyDrawPanel drawPanel = new MyDrawPanel();

        frame.getContentPane().add(BorderLayout.SOUTH, button);
        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // Change the background color

        frame.getContentPane().setBackground(Color.red);

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

    }}}

