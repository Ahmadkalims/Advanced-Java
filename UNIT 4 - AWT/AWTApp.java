import java.awt.*;
import java.awt.event.*;
 
public class AWTApp extends Frame 
{  
  
	AWTApp()	
	{  
		Label firstName = new Label("First Name");  
		firstName.setBounds(20, 50, 80, 20);  
  
		Label lastName = new Label("Last Name");  
		lastName.setBounds(20, 80, 80, 20);  
  
		Label dob = new Label("Date of Birth");  
		dob.setBounds(20, 110, 80, 20);  
  
		TextField firstNameTF = new TextField();  
		firstNameTF.setBounds(120, 50, 100, 20);  
  
		TextField lastNameTF = new TextField();  
		lastNameTF.setBounds(120, 80, 100, 20);  
  
		TextField dobTF = new TextField();  
		dobTF.setBounds(120, 110, 100, 20);  
  
		Button sbmt = new Button("Submit");  
		sbmt.setBounds(20, 160, 100, 30);  
  
		Button reset = new Button("Reset");  
		reset.setBounds(120,160,100,30);  
  
		add(firstName);  
		add(lastName);  
		add(dob);  
		add(firstNameTF);  
		add(lastNameTF);  
		add(dobTF);  
		add(sbmt);  
		add(reset);  
		
		setSize(300,300);  
		setLayout(null);  
		setVisible(true);  
		
		addWindowListener(new WindowAdapter()
		{
            public void windowClosing(WindowEvent e) 
            {
                dispose(); // closes the frame
                System.exit(0); // ends the program
            }
        });
		
	}  
	public static void main(String[] args) 
	{  
		// 	TODO Auto-generated method stub  
		AWTApp awt = new AWTApp();    
	}  
}  

// This program demonstrates a simple AWT application with labels, text fields, and buttons.
// It also handles window closing event to terminate the application gracefully.
//output will be:
// A window with fields for First Name, Last Name, Date of Birth, and Submit/Reset buttons
