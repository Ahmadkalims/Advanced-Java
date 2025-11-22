import javax.swing.*;
import java.awt.*;

public class SwingWindowExample 
{
    public static void main(String[] args) 
    {
        JWindow window = new JWindow();
        JLabel label = new JLabel("Welcome to Swing!", JLabel.CENTER);
        window.add(label, BorderLayout.CENTER);
        window.setSize(300, 200);
        window.setLocationRelativeTo(null); // Center on screen
        window.setVisible(true);

        try 
        {
            Thread.sleep(15000); // Show for 15 seconds
        } 
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        window.dispose(); // Close window
    }
}

// This program demonstrates the use of JWindow in a Swing application.
//output will be:
// A window with a label "Welcome to Swing!" centered on the screen.
// The window is displayed for 15 seconds and then closes automatically.
