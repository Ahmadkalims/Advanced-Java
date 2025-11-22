// This program demonstrates reading a file using byte stream in Java
import java.io.*;

public class ReadFileByteStream
{
    public static void main(String[] args) 
    {
        try 
        {
            FileInputStream fis = new FileInputStream("input.txt");
            int i;
            while ((i = fis.read()) != -1) 
            {  // -1 means end of file
                System.out.print((char) i);   // Convert byte to char for display
            }
            
            fis.close();
        } 
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
//output:
//Contents of input.txt will be displayed on the console.