// This program demonstrates writing a file using character stream in Java
import java.io.*;

public class WriteFileCharacterStream 
{
    public static void main(String[] args) 
    {
        try (FileWriter fw = new FileWriter("char_output.txt")) 
        {
            fw.write("Character Stream Example in Java!");
            System.out.println("File written successfully.");
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
}
