import javax.swing.*;
import java.awt.*;

public class GridLayoutExample 
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("GridLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        GridLayout g = new GridLayout(2,4);

        JPanel panel = new JPanel(g); //new GridLayout(3, 3)

        panel.add(new JButton("Button 1"));
        panel.add(new JButton("Button 2"));
        panel.add(new JButton("Button 3"));
        panel.add(new JButton("Button 4"));
        panel.add(new JButton("Button 5"));
        panel.add(new JButton("Button 6"));
        panel.add(new JButton("Button 7"));
        panel.add(new JButton("Button 8"));
        panel.add(new JButton("Button 9"));
   /*     panel.add(new JButton("Button 10"));
        panel.add(new JButton("Button 11"));
        panel.add(new JButton("Button 12"));*/
        
        frame.add(panel);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}