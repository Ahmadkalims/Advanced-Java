import javax.swing.*;

public class SwingMenuExample 
{
    public static void main(String[] args) 
    {
        JFrame f = new JFrame("Menu Example");

        JMenuBar mb = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenu edit = new JMenu("Edit");

        JMenuItem cut = new JMenuItem("Cut");
        JMenuItem copy = new JMenuItem("Copy");
        JMenuItem paste = new JMenuItem("Paste");

        file.add(cut);
        file.add(copy);
        file.add(paste);
        mb.add(file);
        mb.add(edit);

        f.setJMenuBar(mb);
        f.setSize(400, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

// This program demonstrates the use of JMenuBar, JMenu, and JMenuItem in a Swing application.
//output will be:
// A window with a menu bar containing "File" and "Edit" menus.
// The "File" menu has "Cut", "Copy", and "Paste" menu items.
