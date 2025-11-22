public class StringBufferExample1
{  
    public static void main(String[] args) 
    {  
        // Creating a StringBuffer  
        StringBuffer sb = new StringBuffer("Hello");  
    
        // Appending to the StringBuffer  
        sb.append(", World!");  
        
        // Inserting into the StringBuffer  
        sb.insert(5, " Java");  
        
        System.out.println(sb);
        
        // Deleting from the StringBuffer  
        sb.delete(5, 10);  
        
        System.out.println(sb);   
    }  
}  
