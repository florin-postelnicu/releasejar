
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;



public class KeyViewer extends JFrame {

    JTextField keyText = new JTextField(80);
    JLabel keyLabel = new JLabel("Press any key in the text field ");

    public KeyViewer() {
        super("KeyViewer");
        setSize(350, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        keyText.addKeyListener(new KeyAdapter() {
            public void keyTyped (KeyEvent input) {
                char key = input.getKeyChar();
                keyLabel.setText("You pressed  " + key);
            }

        });
        BorderLayout board = new BorderLayout();
        setLayout(board);
        add(keyLabel, BorderLayout.NORTH);
        add(keyText, BorderLayout.CENTER);
        setVisible(true);
    }

    public static void main(String[] args) {

        new KeyViewer();
    }
}
