import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUIExample1 extends JFrame {
    
    public GUIExample1() {
        // Set up the frame
        setTitle("Java GUI Example");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        
        // Panel for Checkboxes
        JPanel checkBoxPanel = new JPanel();
        checkBoxPanel.setBorder(BorderFactory.createTitledBorder("CheckBox Group"));
        JCheckBox checkBox1 = new JCheckBox("Option 1");
        JCheckBox checkBox2 = new JCheckBox("Option 2");
        JCheckBox checkBox3 = new JCheckBox("Option 3");
        checkBoxPanel.add(checkBox1);
        checkBoxPanel.add(checkBox2);
        checkBoxPanel.add(checkBox3);
        
        // Panel for Choice and List Box
        JPanel choicePanel = new JPanel(new BorderLayout());
        choicePanel.setBorder(BorderFactory.createTitledBorder("Choice and ListBox"));
        
        Choice choice = new Choice();
        choice.add("Choice 1");
        choice.add("Choice 2");
        choice.add("Choice 3");
        choicePanel.add(new JLabel("Choice:"), BorderLayout.WEST);
        choicePanel.add(choice, BorderLayout.CENTER);
        
        // List Box
        DefaultListModel<String> listModel = new DefaultListModel<>();
        listModel.addElement("Item 1");
        listModel.addElement("Item 2");
        listModel.addElement("Item 3");
        JList<String> listBox = new JList<>(listModel);
        JScrollPane listScrollPane = new JScrollPane(listBox);
        choicePanel.add(listScrollPane, BorderLayout.EAST);
        
        // Menu
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Options");
        JMenuItem menuItem1 = new JMenuItem("Option 1");
        JMenuItem menuItem2 = new JMenuItem("Option 2");
        menu.add(menuItem1);
        menu.add(menuItem2);
        menuBar.add(menu);
        setJMenuBar(menuBar);
        
        // Scroll Bar
        JScrollBar scrollBar = new JScrollBar();
        scrollBar.setOrientation(JScrollBar.HORIZONTAL);
        
        // Text Area with Scroll Pane
        JTextArea textArea = new JTextArea(5, 20);
        textArea.setFont(new Font("Arial", Font.PLAIN, 14));
        textArea.setForeground(Color.BLUE);
        JScrollPane textScrollPane = new JScrollPane(textArea);
        
        // Add listeners
        checkBox1.addItemListener(e -> textArea.append("Checkbox 1: " + (checkBox1.isSelected() ? "Checked\n" : "Unchecked\n")));
        checkBox2.addItemListener(e -> textArea.append("Checkbox 2: " + (checkBox2.isSelected() ? "Checked\n" : "Unchecked\n")));
        checkBox3.addItemListener(e -> textArea.append("Checkbox 3: " + (checkBox3.isSelected() ? "Checked\n" : "Unchecked\n")));
        
        choice.addItemListener(e -> textArea.append("Choice selected: " + choice.getSelectedItem() + "\n"));
        listBox.addListSelectionListener(e -> textArea.append("List item selected: " + listBox.getSelectedValue() + "\n"));
        
        menuItem1.addActionListener(e -> textArea.append("Menu Option 1 selected\n"));
        menuItem2.addActionListener(e -> textArea.append("Menu Option 2 selected\n"));
        
        scrollBar.addAdjustmentListener(e -> textArea.append("Scrollbar value: " + scrollBar.getValue() + "\n"));
        
        // Add components to the frame
        add(checkBoxPanel, BorderLayout.NORTH);
        add(choicePanel, BorderLayout.CENTER);
        add(textScrollPane, BorderLayout.EAST);
        add(scrollBar, BorderLayout.SOUTH);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            GUIExample1 frame = new GUIExample1();
            frame.setVisible(true);
        });
    }
}

// This program demonstrates a simple AWT application with various GUI components and event handling.
//output will be:
// A window with checkboxes, choice dropdown, list box, text area, scrollbar, and
// menu. Interacting with these components will log messages in the text area.
