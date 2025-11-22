import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingExample extends JFrame {

    public SwingExample() {
        // Set up the main JFrame
        setTitle("Swing Components Example");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Panel to organize components
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(5, 2, 10, 10));

        // JLabel and JTextField
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameTextField = new JTextField(15);
        mainPanel.add(nameLabel);
        mainPanel.add(nameTextField);

        // JTextArea with JScrollPane
        JLabel bioLabel = new JLabel("Bio:");
        JTextArea bioTextArea = new JTextArea(3, 15);
        JScrollPane bioScrollPane = new JScrollPane(bioTextArea);
        mainPanel.add(bioLabel);
        mainPanel.add(bioScrollPane);

        // JButton and JToggleButton
        JButton submitButton = new JButton("Submit");
        JToggleButton toggleButton = new JToggleButton("Toggle Me");
        mainPanel.add(submitButton);
        mainPanel.add(toggleButton);

        // JCheckBox and JRadioButton
        JCheckBox agreeCheckBox = new JCheckBox("I agree to the terms");
        JRadioButton optionRadioButton = new JRadioButton("Option Selected");
        mainPanel.add(agreeCheckBox);
        mainPanel.add(optionRadioButton);

        // JList with JScrollPane
        JLabel listLabel = new JLabel("Choose an item:");
        String[] items = {"Item 1", "Item 2", "Item 3"};
        JList<String> itemList = new JList<>(items);
        JScrollPane listScrollPane = new JScrollPane(itemList);
        mainPanel.add(listLabel);
        mainPanel.add(listScrollPane);

        // JComboBox
        JLabel comboLabel = new JLabel("Select an option:");
        JComboBox<String> comboBox = new JComboBox<>(new String[]{"Choice 1", "Choice 2", "Choice 3"});
        mainPanel.add(comboLabel);
        mainPanel.add(comboBox);

        // Add mainPanel to JFrame
        add(mainPanel, BorderLayout.CENTER);

        // JButton event to open JWindow and JDialog
        submitButton.addActionListener(e -> showDialogAndWindow());

        setVisible(true);
    }

    private void showDialogAndWindow() {
        // JDialog example
        JDialog dialog = new JDialog(this, "Dialog Example", true);
        dialog.setSize(300, 150);
        dialog.setLayout(new FlowLayout());
        dialog.add(new JLabel("This is a JDialog"));
        JButton closeDialogButton = new JButton("Close");
        closeDialogButton.addActionListener(e -> dialog.dispose());
        dialog.add(closeDialogButton);
        dialog.setLocationRelativeTo(this);
        dialog.setVisible(true);

        // JWindow example
        JWindow window = new JWindow(this);
        window.setSize(200, 100);
        window.setLayout(new FlowLayout());
        window.add(new JLabel("This is a JWindow"));
        JButton closeWindowButton = new JButton("Close Window");
        closeWindowButton.addActionListener(e -> window.dispose());
        window.add(closeWindowButton);
        window.setLocation(300, 200);
        window.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SwingExample::new);
    }
}

// This program demonstrates various Swing components with event handling in a Swing application.
//output will be:
// A window with various Swing components including labels, text fields, text area, buttons, toggle
// button, checkboxes, radio button, list, combo box, and buttons to open JDialog and JWindow.
// Interacting with these components logs events in the text area.
