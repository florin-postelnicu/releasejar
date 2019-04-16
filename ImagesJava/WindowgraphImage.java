package IntroJavaSwing01;

import javax.swing.*;
import java.io.*;
import java.awt.*;
import java.awt.image.*;
import javax.imageio.ImageIO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;


public class WindowgraphImage  implements ActionListener {
    JFrame frame;

    public static void main(String[] args) {
        WindowgraphImage mygraf = new WindowgraphImage();
        mygraf.go();
    }
    public void go() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Change colors");
        button.addActionListener(this);

        MyDrawPanel drawPanel = new MyDrawPanel();
        frame.add(drawPanel);



        frame.getContentPane().add(BorderLayout.SOUTH, button);
        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
        frame.setSize(300, 300);
        frame.pack();


        frame.setVisible(true);

    }

    public void actionPerformed(ActionEvent event){
        frame.repaint();
    }

class MyDrawPanel extends JPanel {


        public void paintComponent(Graphics g) {
//            JPanel panel = new JPanel;
            Graphics2D g2d = (Graphics2D) g;

          Image image = new ImageIcon("C:\\Users\\postelnicu\\IdeaProjects\\FlorinJavaG\\src\\IntroJavaSwing01\\ImagesFolder\\katie.jpg").getImage();




            System.out.println("Acum");
            g2d.drawImage(image, 3, 4, this);

//

        }}}
