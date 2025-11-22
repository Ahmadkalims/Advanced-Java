import java.io.*;
// Example of using BufferedReader and BufferedWriter
public class BufferedCharacterExample 
{
    public static void main(String[] args)
    {
        try (
        		BufferedReader br = new BufferedReader
        		(new FileReader("input.txt"));
        		BufferedWriter bw = new BufferedWriter
        				(new FileWriter("output_buffered.txt"));
        	)
        {
            String line;
            while ((line = br.readLine()) != null)
            {
                bw.write(line);
                bw.newLine(); // adds newline
            }
            
            System.out.println("File copied successfully "
            		+ "using BufferedReader/Writer!");
            
        } 
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}

//output_buffered.txt will contain the same content as input.txt but written using buffered streams.