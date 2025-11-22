import javax.swing.*;
import java.awt.*;

public class SwingEventExample extends JFrame {
    
    private static final long serialVersionUID = 1L;
    
	private JTextArea outputTextArea;

    public SwingEventExample() {
        // Set up the main JFrame
        setTitle("Swing Components with Event Handling");
        setSize(600, 500);
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

        // JButton and JToggleButton with event handling
        JButton submitButton = new JButton("Submit");
        JToggleButton toggleButton = new JToggleButton("Toggle Me");
        mainPanel.add(submitButton);
        mainPanel.add(toggleButton);

        // JCheckBox and JRadioButton with event handling
        JCheckBox agreeCheckBox = new JCheckBox("I agree to the terms");
        JRadioButton optionRadioButton = new JRadioButton("Select Option");
        mainPanel.add(agreeCheckBox);
        mainPanel.add(optionRadioButton);

        // JList with JScrollPane and event handling
        JLabel listLabel = new JLabel("Select an item:");
        String[] items = {"Item 1", "Item 2", "Item 3"};
        JList<String> itemList = new JList<>(items);
        JScrollPane listScrollPane = new JScrollPane(itemList);
        mainPanel.add(listLabel);
        mainPanel.add(listScrollPane);

        // JComboBox with event handling
        JLabel comboLabel = new JLabel("Select an option:");
        JComboBox<String> comboBox = new JComboBox<>(new String[]{"Option 1", "Option 2", "Option 3"});
        mainPanel.add(comboLabel);
        mainPanel.add(comboBox);

        // Add mainPanel to JFrame
        add(mainPanel, BorderLayout.CENTER);

        // JTextArea for displaying output (Event Log)
        outputTextArea = new JTextArea(5, 30);
        outputTextArea.setEditable(false);
        JScrollPane outputScrollPane = new JScrollPane(outputTextArea);
        add(outputScrollPane, BorderLayout.SOUTH);

        // Event Delegation: Adding Event Listeners to Components
        submitButton.addActionListener(e -> outputTextArea.append("Submit Button clicked\n"));
        toggleButton.addItemListener(e -> outputTextArea.append("Toggle Button: " + (toggleButton.isSelected() ? "On" : "Off") + "\n"));
        agreeCheckBox.addItemListener(e -> outputTextArea.append("Checkbox: " + (agreeCheckBox.isSelected() ? "Checked" : "Unchecked") + "\n"));
        optionRadioButton.addActionListener(e -> outputTextArea.append("Radio Button selected\n"));
        itemList.addListSelectionListener(e -> outputTextArea.append("List Item Selected: " + itemList.getSelectedValue() + "\n"));
        comboBox.addActionListener(e -> outputTextArea.append("ComboBox Selected: " + comboBox.getSelectedItem() + "\n"));

        // JButton to open JWindow and JDialog
        JButton openDialogButton = new JButton("Open Dialog & Window");
        openDialogButton.addActionListener(e -> showDialogAndWindow());
        add(openDialogButton, BorderLayout.NORTH);

        setVisible(true);
    }

    private void showDialogAndWindow() {
        // JDialog example
        JDialog dialog = new JDialog(this, "JDialog Example", true);
        dialog.setSize(300, 150);
        dialog.setLayout(new FlowLayout());
        dialog.add(new JLabel("This is a JDialog"));
        JButton closeDialogButton = new JButton("Close Dialog");
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
        SwingUtilities.invokeLater(SwingEventExample::new);
    }
}

