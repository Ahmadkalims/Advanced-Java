import java.awt.*;  
import javax.swing.*;

public class GridBagLayoutExample extends JFrame
{  
    public static void main(String[] args) 
    {  
            GridBagLayoutExample a = new GridBagLayoutExample();  
    }  
    
    GridBagLayoutExample()
    {
    	GridBagLayout grid = new GridBagLayout();  
        GridBagConstraints gbc = new GridBagConstraints();  
        
        setLayout(grid);  
        setTitle("GridBag Layout Example");  
        
        GridBagLayout layout = new GridBagLayout();  
        this.setLayout(layout);  
        gbc.fill = GridBagConstraints.HORIZONTAL;  
       
        gbc.gridx = 0;  
        gbc.gridy = 0;  
        this.add(new Button("Button One"), gbc);  
       
        gbc.gridx = 1;  
        gbc.gridy = 0;  
        this.add(new Button("Button two"), gbc);  
      
        gbc.fill = GridBagConstraints.HORIZONTAL;  
        gbc.ipady = 80;  
        gbc.gridx = 0;  
        gbc.gridy = 1;  
        this.add(new Button("Button Three"), gbc);  
        gbc.gridx = 1;  
        gbc.gridy = 1;  
        this.add(new Button("Button Four"), gbc);  
        
        gbc.gridx = 0;  
        gbc.gridy = 2;  
        gbc.fill = GridBagConstraints.HORIZONTAL;  
        gbc.gridwidth = 2;  
        this.add(new Button("Button Five"), gbc);  
       
        setSize(300, 300);  
        setPreferredSize(getSize());  
        setVisible(true);  
        setDefaultCloseOperation(EXIT_ON_CLOSE);  
    }     
}  

// This program demonstrates the use of GridBagLayout in a Swing application.
//output will be:
// A window with five buttons arranged using GridBagLayout with different constraints.
