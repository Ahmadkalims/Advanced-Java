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

// This program demonstrates the use of JComboBox in a Swing application.
//output will be:
// A window with a dropdown combo box containing country names and a button.
// Selecting a country and clicking the button shows a dialog with the selected country.
