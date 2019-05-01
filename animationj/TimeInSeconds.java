package mypackage01;
import java.awt.*;
import java.awt.event.*;
import java.util.Date;
import java.lang.Thread;

/*
FlowLayout
The FlowLayout arranges the components in a directional flow, either from left to right or from right to left.
Normally all components are set to one row, according to the order of different components.
If all components can not be fit into one row, it will start a new row and fit the rest in.

To construct a FlowLayout, three options could be chosen:

1) FlowLayout(): construct a new FlowLayout object with center alignment and horizontal
 and vertical gap to be default size of 5 pixels.
2) FlowLayout(int align): construct similar object with different settings on alignment
3) FlowLayout(int align, int hgap, int vgap): construct similar object with different
settings on alignment and gaps between components.
 */
//**************************

/*
WindowAdapter class implements the methods in all
three kinds of window -related handlers,( handling WindowEvents objects)

WindowListener
WindowFocusListener
WindowStateListener - has a single method to detect a change to the state of the window,
                      such as when the window is iconified, deiconified,
                      maximized, or restored to normal.


1) Opening a window — Showing a window for the first time.             |
2) Closing a window — Removing the window from the screen.             |It could be also used the methods
                                                                        on JFrame or JDialog:
                                                                        setDefaultCloseOperation()
              see :  Responding to Window Closing Events
                     https://docs.oracle.com/javase/tutorial/uiswing/components/frame.html#windowevents
3) Iconifying a window — Reducing the window to an icon on the desktop.| WindowListener interface
4) Deiconifying a window — Restoring the window to its original size.  |
5) Focused window — The window which contains the "focus owner".         | WindowFocusListener
6) Activated window (frame or dialog) — This window is either the focused window,
 or owns the focused window.
7) Deactivated window — This window has lost the focus. For more information about focus,
see the AWT Focus Subsystem specification.
8) Maximizing the window — Increasing a window's size to the maximum allowable size,
either in the vertical direction, the horizontal direction, or both directions.
 */
public class TimeInSeconds extends Frame implements Runnable
{
    private Label lblOne;
    private Date dd;
    private Thread th;

    public TimeInSeconds()
    {
        setTitle("Current time");
        setSize(200,150);
        setVisible(true);
        setLayout(new FlowLayout());//  construct a new FlowLayout object with center alignment
                                    // and horizontal and vertical gap to be default size of 5 pixels.
        addWindowListener(new WindowAdapter() {
            public void windowClose(WindowEvent we){
                System.exit(0);
            }
        });
        lblOne = new Label("00:00:00");
        add(lblOne);

        th = new Thread(this);
        th.start(); // here thread starts
    }

    public void run()
    {
        try
        {
            do
            {
                dd = new Date();
                lblOne.setText(dd.getHours() + " : " + dd.getMinutes() + " : " + dd.getSeconds());
                Thread.sleep(1000);  // 1000 = 1 second
            }while(th.isAlive());
        }
        catch(Exception e)
        {

        }
    }

    public static void main(String[] args)
    {
        new TimeInSeconds();
    }
}
