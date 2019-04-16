package IntroJavaSwing01;



import java.awt.image.*;
import java.io.*;
import javax.swing.*;
import javax.imageio.ImageIO;

public class JPanelExample {

    public static void main(String[] args) {
        JPanel  panel = new JPanel();

        BufferedImage image= null;
        try {
            image = ImageIO.read(new File("C:\\Users\\postelnicu\\IdeaProjects\\FlorinJavaG\\src\\IntroJavaSwing01\\ImagesFolder\\katie.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        JLabel label = new JLabel(new ImageIcon(image));
        panel.add(label);

        // main window
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("JPanel Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // add the Jpanel to the main window
        frame.add(panel);

        frame.pack();
        frame.setVisible(true);
    }
}
