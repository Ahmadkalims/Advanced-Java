// Example of using Scanner to read from a string and user input in Java
import java.util.*;  
 
public class ScannerExample2 
{
	public static void main(String args[])
	{                       
        String s = "Hello, This is Java Class";  
        //Create scanner Object and pass string in it  
        Scanner scan = new Scanner(s);  
        //Check if the scanner has a token  
        System.out.println("Boolean Result: " + scan.hasNext());  
        //Print the string  
        System.out.println("String: " +scan.nextLine());  
        scan.close();           
        System.out.println("--------Enter Your Details-------- ");  
        Scanner in = new Scanner(System.in);  
        System.out.print("Enter your name: ");    
        String name = in.next();   
        System.out.println("Name: " + name);           
        System.out.print("Enter your age: ");  
        int i = in.nextInt();  
        System.out.println("Age: " + i);  
        System.out.print("Enter your salary: ");  
        double d = in.nextDouble();  
        System.out.println("Salary: " + d);         
        in.close();           
    }

}

//  Output:
//Boolean Result: true
//String: Hello, This is Java Class
//--------Enter Your Details-------- 
//Enter your name: Avinash
//Name: Avinash
//Enter your age: 25
//Age: 25
//Enter your salary: 50000.0
//Salary: 50000.0