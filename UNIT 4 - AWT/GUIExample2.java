import java.awt.*;
import java.awt.event.*;

public class GUIExample2 extends Frame implements ActionListener, ItemListener, AdjustmentListener 
{
    // Components
    Checkbox checkbox1, checkbox2;
    CheckboxGroup checkboxGroup;
    Choice choice;
    List listBox;
    Panel mainPanel, checkboxPanel, choicePanel;
    ScrollPane scrollPane;
    Scrollbar scrollbar;
    TextArea textArea;
    MenuBar menuBar;
    Menu menu;
    MenuItem menuItem1, menuItem2;

    public GUIExample2() {
        // Frame settings
        setTitle("AWT GUI Example");
        setSize(600, 500);
        setLayout(new BorderLayout());
        
        // Checkbox Group
        checkboxGroup = new CheckboxGroup();
        checkbox1 = new Checkbox("Option 1", checkboxGroup, false);
        checkbox2 = new Checkbox("Option 2", checkboxGroup, false);
        
        // Panel for Checkboxes
        checkboxPanel = new Panel();
        checkboxPanel.setBackground(Color.LIGHT_GRAY);
        checkboxPanel.add(new Label("Checkbox Group:"));
        checkboxPanel.add(checkbox1);
        checkboxPanel.add(checkbox2);
        
        // Choice dropdown
        choice = new Choice();
        choice.add("Choice 1");
        choice.add("Choice 2");
        choice.add("Choice 3");

        // List box
        listBox = new List(3);
        listBox.add("Item 1");
        listBox.add("Item 2");
        listBox.add("Item 3");

        // Panel for Choice and List Box
        choicePanel = new Panel(new GridLayout(1, 2));
        choicePanel.add(choice);
        choicePanel.add(listBox);

        // Text Area with Scroll Pane
        textArea = new TextArea(5, 20);
        textArea.setFont(new Font("Arial", Font.PLAIN, 14));
        textArea.setForeground(Color.BLUE);
        scrollPane = new ScrollPane();
        scrollPane.add(textArea);
        
        // Menu Bar
        menuBar = new MenuBar();
        menu = new Menu("Options");
        menuItem1 = new MenuItem("Option 1");
        menuItem2 = new MenuItem("Option 2");
        menu.add(menuItem1);
        menu.add(menuItem2);
        menuBar.add(menu);
        setMenuBar(menuBar);

        // Scroll Bar
        scrollbar = new Scrollbar(Scrollbar.HORIZONTAL);

        // Main Panel
        mainPanel = new Panel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(checkboxPanel, BorderLayout.NORTH);
        mainPanel.add(choicePanel, BorderLayout.CENTER);
        
        add(mainPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
        add(scrollbar, BorderLayout.SOUTH);

        // Adding Listeners
        checkbox1.addItemListener(this);
        checkbox2.addItemListener(this);
        choice.addItemListener(this);
        listBox.addItemListener(this);
        menuItem1.addActionListener(this);
        menuItem2.addActionListener(this);
        scrollbar.addAdjustmentListener(this);
        
        // Close Window Event
        addWindowListener(new WindowAdapter() 
        {
            public void windowClosing(WindowEvent we)
            {
                dispose();
            }
        });
    }

    // Event Handling Methods
    public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource() == menuItem1)
        {
            textArea.append("Menu Option 1 selected\n");
        } else if (e.getSource() == menuItem2) {
            textArea.append("Menu Option 2 selected\n");
        }
    }

    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == checkbox1) {
            textArea.append("Checkbox 1 selected\n");
        } else if (e.getSource() == checkbox2) {
            textArea.append("Checkbox 2 selected\n");
        } else if (e.getSource() == choice) {
            textArea.append("Choice selected: " + choice.getSelectedItem() + "\n");
        } else if (e.getSource() == listBox) {
            textArea.append("List item selected: " + listBox.getSelectedItem() + "\n");
        }
    }

    public void adjustmentValueChanged(AdjustmentEvent e) {
        if (e.getSource() == scrollbar) {
            textArea.append("Scrollbar value: " + scrollbar.getValue() + "\n");
        }
    }

    public static void main(String[] args) {
    	GUIExample2 example = new GUIExample2();
        example.setVisible(true);
    }
}

// This program demonstrates a simple AWT application with various GUI components and event handling.
//output will be:
// A window with checkboxes, choice dropdown, list box, text area, scrollbar, and menu
// Interacting with these components will log messages in the text area.
