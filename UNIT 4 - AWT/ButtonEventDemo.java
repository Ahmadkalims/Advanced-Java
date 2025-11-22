import java.awt.*;
import java.awt.event.*;

public class ButtonEventDemo extends WindowAdapter implements ActionListener
{
	Frame f;
    Button b;

    ButtonEventDemo() 
    {
    	f=new Frame();
        b = new Button("Click Me");
        b.setBounds(100, 100, 100, 40);
        f.add(b);
        b.addActionListener(this); // Register listener for Button

        f.setSize(300, 200);
        f.setLayout(null);
        f.setVisible(true);
        f.setLocationRelativeTo(null);
        f.addWindowListener(this); // Register listener for Frame
    }

    public void actionPerformed(ActionEvent e)
    {
        System.out.println("Button was clicked!");
    }
    
    public void windowClosing(WindowEvent e) 
    {
        f.dispose();
        System.exit(0);
    }

    public static void main(String[] args)
    {
        new ButtonEventDemo();
    }
}

// This program demonstrates handling button click events in an AWT application.
//output will be:
// A window with a button labeled "Click Me"
// When the button is clicked, "Button was clicked!" will be printed to the console
// When the window is closed, the application will terminate gracefully.