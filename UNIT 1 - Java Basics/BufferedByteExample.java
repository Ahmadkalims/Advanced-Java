import java.io.*;

public class BufferedByteExample 
{
    public static void main(String[] args)
    {
        try (
        		BufferedInputStream bis = new BufferedInputStream
        		(new FileInputStream("input.txt"));
        		BufferedOutputStream bos = new BufferedOutputStream
        				(new FileOutputStream("output_buffered.txt"));
        	) 
        {
            int b;
            while ((b = bis.read()) != -1) 
            {
                bos.write(b);
            }
            
            System.out.println("File copied successfully using buffered streams!");
            
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
}
