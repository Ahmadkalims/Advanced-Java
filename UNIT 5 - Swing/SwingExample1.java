import javax.swing.*;

public class SwingExample1
{
    public static void main(String[] args)
    {
        // Create a frame (window)
        JFrame jf = new JFrame("My First Swing App");

        // Create a button
        JButton jb = new JButton("Click Me!");
        jb.setBounds(130, 100, 100, 40);  // x, y, width, height

        // Add button to frame
        jf.add(jb);

        // Frame settings
        jf.setSize(400, 300);
        jf.setLayout(null);   // Absolute positioning
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
