// Example of using PrintWriter to write formatted data to a file in Java
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterExample 
{
    public static void main(String[] args) 
    {
        try (PrintWriter printWriter = new PrintWriter(new FileWriter("printWriter.txt"))) 
        {
            printWriter.println("Hello, PrintWriter!");
            printWriter.printf("Number: %d, String: %s%n", 42, "Java I/O");
            System.out.println("Data written using PrintWriter.");
        }
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
}
