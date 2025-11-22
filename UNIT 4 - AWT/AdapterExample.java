import java.awt.*;
import java.awt.event.*;

public class AdapterExample extends WindowAdapter 
{
	Frame f;
	
    AdapterExample() 
    {
    	f = new Frame("My Frame");
        f.addWindowListener(this);
               
    
        f.setSize(300, 200);
        f.setLayout(null);
        f.setVisible(true);
             
    }
    
    public void windowClosing(WindowEvent e)
    {
            System.out.println("Window closing...");
            System.exit(0);
    }

    public static void main(String[] args) 
    {
        new AdapterExample();
    }
}

// This program demonstrates the use of WindowAdapter to handle window closing event in AWT.
//output will be:
// When the window is closed, it will print "Window closing..." in the console and exit

