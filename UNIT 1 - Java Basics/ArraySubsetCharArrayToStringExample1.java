// Example of converting a char array to a String using a subset of the array
public class ArraySubsetCharArrayToStringExample1
{  
    public static void main(String[] args) 
    {  
        // Define a char array  
        char[] charArray = {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd'};  
    
        // Construct a string from a subset of the char array  
        // Here, we start at index 6 (the space character) and use the next 5 characters  
        
        String resultString = new String(charArray, 6, 5);  
        
        // Output the result  
        System.out.println(resultString);   
    }  
}  