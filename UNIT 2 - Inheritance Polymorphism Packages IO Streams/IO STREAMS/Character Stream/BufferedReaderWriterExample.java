import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// Example of using BufferedReader and BufferedWriter and converting character streams

public class BufferedReaderWriterExample {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("input.txt"));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("output.txt"))) {
             
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            System.out.println("File copied using buffered reader and writer.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
