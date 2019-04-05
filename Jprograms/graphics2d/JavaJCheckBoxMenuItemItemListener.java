package com.exercises.javaprograms;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import javax.swing.AbstractButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class JavaJCheckBoxMenuItemItemListener {
    public static void main(String[] args) {
        JFrame frame =  new JFrame("Menu Sample Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JMenuBar menuBar = new JMenuBar();

        // File Menu,  F - Mnemonic
        JMenu fileMenu = new JMenu(("File"));
        fileMenu.setMnemonic(KeyEvent.VK_F);
        menuBar.add(fileMenu);

        // File New , N - Mnemonic
        JMenuItem newMenuItem = new JMenuItem("New", KeyEvent.VK_N);
        fileMenu.add(newMenuItem);

        JCheckBoxMenuItem caseMenuItem = new JCheckBoxMenuItem("Case Sensitive");
        caseMenuItem.setMnemonic(KeyEvent.VK_C);
        fileMenu.add(caseMenuItem);

        ItemListener ilistener = new ItemListener() {

            public void itemStateChanged(ItemEvent event) {
                Icon girlIcon = new ImageIcon("girl-r.jpg");
                Icon boyIcon = new ImageIcon("boy=r.jpg");
                AbstractButton aButton = (AbstractButton) event.getSource();
                int state = event.getStateChange();
                String newlabel;
                Icon newIcon;
                if ( state == ItemEvent.SELECTED){
                    newlabel = "Girl";
                    newIcon = girlIcon;
                } else {
                    newlabel = "Boy";
                    newIcon = boyIcon;
                }
                aButton.setText(newlabel);
                aButton.setIcon(newIcon);

            }
        };
        caseMenuItem.addItemListener(ilistener);
        frame.setJMenuBar(menuBar);
        frame.setSize(350, 250);
        frame.setVisible(true);
    }


}
