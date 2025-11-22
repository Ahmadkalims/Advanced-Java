import javax.swing.*;
import java.awt.*;

public class SwingCheckBoxExample 
{
    public static void main(String[] args) 
    {
        JFrame f = new JFrame("JCheckBox Example");

        JCheckBox c1 = new JCheckBox("C++");
        JCheckBox c2 = new JCheckBox("Java");
        JCheckBox c3 = new JCheckBox("Python");

        JButton b = new JButton("Show Selected");
    
        b.addActionListener(e ->
        {
            String msg = "";
            if (c1.isSelected()) msg += "C++ ";
            if (c2.isSelected()) msg += "Java ";
            if (c3.isSelected()) msg += "Python ";
            JOptionPane.showMessageDialog(f, "You selected: " + msg);
        });

        f.add(c1); f.add(c2); f.add(c3); f.add(b);
        f.setLayout(new FlowLayout());
        f.setSize(300, 200);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
