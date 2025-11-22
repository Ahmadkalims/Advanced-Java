import javax.swing.*;

public class SwingScrollPaneExample 
{
    public static void main(String[] args) 
    {
        JFrame f = new JFrame("JScrollPane Example");

        JTextArea area = new JTextArea(10, 30);
      //  area.setText("This is a long text...\n".repeat(100)); // Sample long text

        JScrollPane scrollPane = new JScrollPane(area);
        f.add(scrollPane);

        f.setSize(400, 250);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
