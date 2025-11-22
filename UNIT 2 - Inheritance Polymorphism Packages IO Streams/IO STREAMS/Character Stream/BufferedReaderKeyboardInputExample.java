import java.io.*;
// Example of taking keyboard input using BufferedReader
public class BufferedReaderKeyboardInputExample 
{
    public static void main(String[] args)
    {
        try (BufferedReader br = new BufferedReader
        		(new InputStreamReader(System.in))) 
        {
            System.out.print("Enter your name: ");
            String name = br.readLine();
            System.out.println("Hello, " + name + "!");
        }
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
}

// This program reads a name from keyboard input and greets the user.
//output will be like:
// Enter your name: John
// Hello, John!