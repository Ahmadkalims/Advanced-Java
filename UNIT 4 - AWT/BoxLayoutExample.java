import javax.swing.*;
import java.awt.*;

public class BoxLayoutExample 
{
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame("BoxLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); //X_AXIS

        panel.add(new JButton("Button 1"));
        panel.add(new JButton("Button 2"));
        panel.add(new JButton("Button 3"));

        frame.add(panel);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}

// This program demonstrates the use of BoxLayout in a Swing application.
//output will be:
// A window with three buttons arranged vertically using BoxLayout.
