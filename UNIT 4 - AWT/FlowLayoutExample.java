import javax.swing.*;
import java.awt.*;

public class FlowLayoutExample 
{
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame("FlowLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new FlowLayout());

        panel.add(new JButton("Button 1"));
        panel.add(new JButton("Button 2"));
        panel.add(new JButton("Button 3"));
        panel.add(new JButton("Button 4"));
        panel.add(new JButton("Button 5"));
        panel.add(new JButton("Button 6"));
        panel.add(new JButton("Button 7"));
        panel.add(new JButton("Button 8"));
        panel.add(new JButton("Button 9"));

        frame.add(panel);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}

// This program demonstrates the use of FlowLayout in a Swing application.
//output will be:
// A window with nine buttons arranged using FlowLayout.
