import javax.swing.*;
import java.awt.*;

public class BorderLayoutExample
{
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame("BorderLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton northButton = new JButton("North");
        JButton southButton = new JButton("South");
        JButton eastButton = new JButton("East");
        JButton westButton = new JButton("West");
        JButton centerButton1 = new JButton("Center1");
      //  JButton centerButton2 = new JButton("Center2");

        frame.add(northButton, BorderLayout.EAST);
        frame.add(southButton, BorderLayout.NORTH);
        frame.add(eastButton, BorderLayout.SOUTH);
        frame.add(westButton, BorderLayout.WEST);
        frame.add(centerButton1, BorderLayout.CENTER);
       // frame.add(centerButton2, BorderLayout.CENTER);

        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}

// This program demonstrates the use of BorderLayout in a Swing application.
//output will be:
// A window with five buttons arranged in the BorderLayout regions: North, South, East, West, and Center.
