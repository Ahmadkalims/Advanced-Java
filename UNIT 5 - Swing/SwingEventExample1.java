import javax.swing.*;
import java.awt.event.*;

public class SwingEventExample1
{
    public static void main(String[] args)
    {
        JFrame f = new JFrame("Button Example");
        JTextField tf = new JTextField();
        tf.setBounds(50, 50, 150, 20);
        
        JButton b = new JButton("Click Here");
        b.setBounds(50, 100, 100, 30);
        
        // Add ActionListener
        b.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                tf.setText("Welcome to Swing!");
            }
        });
        
        f.add(b);
        f.add(tf);
        f.setSize(300, 200);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

// This program demonstrates a simple Swing application with a button and a text field.
//output will be:
// A window with a button labeled "Click Here" and a text field.
// Clicking the button sets the text field to "Welcome to Swing!".

