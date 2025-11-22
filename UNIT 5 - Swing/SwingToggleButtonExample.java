import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingToggleButtonExample
{
    public static void main(String[] args) 
    {
        JFrame f = new JFrame("JToggleButton Example");
        JToggleButton toggle = new JToggleButton("ON");
        
        toggle.addItemListener(e ->
        {
            if (toggle.isSelected())
                toggle.setText("OFF");
            else
                toggle.setText("ON");
        });

        f.add(toggle);
        f.setSize(200, 150);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

// This program demonstrates the use of JToggleButton in a Swing application.
//output will be:
// A window with a toggle button labeled "ON".
// Clicking the toggle button switches its label between "ON" and "OFF".   
