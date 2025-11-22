// This program demonstrates reading a file using character stream in Java
import java.io.*;

public class ReadFileCharacterStream 
{
    public static void main(String[] args) 
    {
        try (FileReader fr = new FileReader("input.txt"))
        {
            int ch;
            while ((ch = fr.read()) != -1) 
            {
                System.out.print((char) ch);
            }
            
        } 
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}

// This program reads the content of "input.txt" and displays it on the console using FileReader.
//output will be the content of input.txt displayed on the console.
