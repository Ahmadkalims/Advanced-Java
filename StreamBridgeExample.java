import java.io.*;

public class StreamBridgeExample
{
    public static void main(String[] args)
    {
        try (
        		BufferedReader br = new BufferedReader(
                new InputStreamReader(new FileInputStream("input.txt"), "UTF-8"));
        		            
        		BufferedWriter bw = new BufferedWriter(
                new OutputStreamWriter(new FileOutputStream("output.txt"), "UTF-8"))
            )
        {

            String line;
            while ((line = br.readLine()) != null)
            {
                bw.write(line.toUpperCase());
                bw.newLine();
            }

            System.out.println("File copied with uppercase conversion!");
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
}
