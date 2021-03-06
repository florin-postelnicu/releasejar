package programforstudents;


import java.awt.EventQueue;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

/*
Program for viewing images
You can choose any images from your files
and set it as a label.
The program creates access to all your files, gets a selected image file, and
sets it up as a label.
 */
public class ImageViewerF {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new ImageViewerFrame();
                frame.setTitle("ImageViewerF");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}
/*
A Frame with a Label to show on the image
 */

class ImageViewerFrame extends JFrame
{
    private JLabel label;
    private JFileChooser chooser;
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 400;

    public ImageViewerFrame()
    {
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

        // use a label to display the images

        label = new JLabel();
        add(label);

        // set up the file chooser

        chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File("."));

        // set up a menu bar

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu menu = new JMenu("File");
        menuBar.add(menu);

        JMenuItem openItem = new JMenuItem("Open");
        menu.add(openItem);
        openItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {

                // show file chooser dialog
                int result = chooser.showOpenDialog(null);

                // if file selected , set it as icon of the label
                if (result == JFileChooser.APPROVE_OPTION)
                {
                    String name = chooser.getSelectedFile().getPath();
                    label.setIcon(new ImageIcon(name));
                }

            }
        });

        JMenuItem exitItem = new JMenuItem("Exit");
        menu.add(exitItem);
        exitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                {
                    System.exit(0);
                }

            }
        });

    }
}
