import javax.swing.*;
import java.awt.*;

public class SwingComboBoxExample
{
    public static void main(String[] args) 
    {
        JFrame f = new JFrame("JComboBox Example");

        String items[] = {"India", "USA", "UK", "Canada"};
        JComboBox<String> combo = new JComboBox<>(items);
        JButton b = new JButton("Show Selected");

        b.addActionListener(e -> JOptionPane.showMessageDialog(f, "Selected: " 
        + combo.getSelectedItem()));

        f.add(combo);
        f.add(b);
        f.setLayout(new FlowLayout());
        f.setSize(250, 150);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
