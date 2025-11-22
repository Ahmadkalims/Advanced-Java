// This program demonstrates writing a file using byte stream in Java
import java.io.*;

public class WriteFileByteStream 
{
    public static void main(String[] args)
    {
        String data = "Hello Java I/O Streams!";
        try 
        {
            FileOutputStream fos = new FileOutputStream("output.txt");
            fos.write(data.getBytes()); // Convert String → bytes
            fos.close();
            System.out.println("Data written successfully.");
        } 
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
