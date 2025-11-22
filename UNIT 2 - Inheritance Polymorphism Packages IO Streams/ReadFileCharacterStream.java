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
