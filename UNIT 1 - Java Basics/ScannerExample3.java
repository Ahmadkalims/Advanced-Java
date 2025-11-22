// Example of using Scanner to tokenize a string with a custom delimiter in Java
import java.util.*;  
 
public class ScannerExample3 
{
	public static void main(String args[])
	{                       
        String str = "Hello/This is , Java Class/My name is Piyush.";  
       
        //Create scanner with the specified String Object  
        Scanner scanner = new Scanner(str);  
        System.out.println("Boolean Result: "+scanner.hasNextBoolean());            
       
        //Change the delimiter of this scanner  
        scanner.useDelimiter(",");  
       
        //Printing the tokenized Strings  
        System.out.println("---Tokenizes String---");   
      
        while(scanner.hasNext())
        {
        	System.out.println(scanner.next());  
        }  
        
        //Display the new delimiter  
        System.out.println("Delimiter used: " +scanner.delimiter());            
        scanner.close();  
    }
}
