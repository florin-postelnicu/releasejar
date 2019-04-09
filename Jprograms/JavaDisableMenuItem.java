package com.exercises.javaprograms;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;


public class JavaDisableMenuItem {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Menu Sample Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new  JMenu("File");
        fileMenu.setMnemonic(KeyEvent.VK_F);
        menuBar.add(fileMenu);


        JMenuItem newMenuItem = new JMenuItem("New", KeyEvent.VK_N);
        fileMenu.add(newMenuItem);

        JMenuItem pasteMenuItem = new JMenuItem("Paste",KeyEvent.VK_P);
        KeyStroke ctrlVKeyStroke = KeyStroke.getKeyStroke("control V");
        pasteMenuItem.setAccelerator(ctrlVKeyStroke);
        pasteMenuItem.setEnabled(true);
        fileMenu.add(pasteMenuItem);

        // Name of the Menu Button "Katie"
        JMenu fileMenu1 = new JMenu("Katie");
        // Underscore the first letter in "Katie" for key stroke
        fileMenu1.setMnemonic(KeyEvent.VK_K);
        // Add button "Katie" to the menu bar
        menuBar.add(fileMenu1);

        // Create a new item in the category "Katie"
        // and name it Meow
        JMenuItem newMenuItem1 = new JMenuItem("Meow", KeyEvent.VK_M);
        fileMenu1.add(newMenuItem1);

        JMenuItem pasteMenuItem1 = new JMenuItem("Lives",KeyEvent.VK_L);
        KeyStroke ctrlVKeyStroke1 = KeyStroke.getKeyStroke("control W");
        pasteMenuItem1.setAccelerator(ctrlVKeyStroke1);
        pasteMenuItem1.setEnabled(true);
        fileMenu1.add(pasteMenuItem1);

        JMenuItem newKatieItem = new JMenuItem("Tail", KeyEvent.VK_T);
        KeyStroke ctrlVKeyStroke2 = KeyStroke.getKeyStroke("control T");
        newKatieItem.setAccelerator(ctrlVKeyStroke2);
        newKatieItem.setEnabled(true);
        fileMenu1.add(newKatieItem);



        frame.setJMenuBar(menuBar);
        frame.setSize(350, 250);
        frame.setVisible(true);

    }
}
