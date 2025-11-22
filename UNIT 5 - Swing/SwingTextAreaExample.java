import javax.swing.*;
import java.awt.*;

public class SwingTextAreaExample 
{
    public static void main(String[] args) 
    {
        JFrame f = new JFrame("JTextArea Example");
        JTextArea area = new JTextArea(5, 20);
        JButton b = new JButton("Show Text");

        b.addActionListener(e -> JOptionPane.showMessageDialog(f, "You wrote:\n" 
        + area.getText()));

        f.add(new JScrollPane(area));
        f.add(b);
        f.setLayout(new FlowLayout());
        f.setSize(300, 200);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

// This program demonstrates the use of JTextArea in a Swing application.
//output will be:
// A window with a text area and a button labeled "Show Text".
// Typing text in the text area and clicking the button shows a dialog with the entered text.
