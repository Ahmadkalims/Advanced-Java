import javax.swing.*;
import java.awt.*;

public class SwingListExample
{
    public static void main(String[] args)
    {
        JFrame f = new JFrame("JList Example");

        String languages[] = {"C", "C++", "Java", "Python", "Kotlin"};
        JList<String> list = new JList<>(languages);
        list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        JButton b = new JButton("Show Selected");
        
        b.addActionListener(e -> 
        {
            java.util.List<String> selected = list.getSelectedValuesList();
            JOptionPane.showMessageDialog(f, "Selected: " + selected);
        });

        f.add(new JScrollPane(list));
        f.add(b);
        f.setLayout(new FlowLayout());
        f.setSize(300, 200);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
