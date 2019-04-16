package IntroJavaSwing01;


// The image is the icon for the frame
import javax.swing.*;

import java.awt.image.*;



public class JFrameChangeIcon {
    public static void main(String[] args) {

        //Create a basic JFrame
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("JFrame Change Icon Example");
        frame.setSize(300,150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        ImageIcon img = new ImageIcon("C:\\Users\\postelnicu\\IdeaProjects\\FlorinJavaG\\src\\IntroJavaSwing01\\ImagesFolder\\katie.jpg");
        frame.setIconImage(img.getImage());
    }
}
