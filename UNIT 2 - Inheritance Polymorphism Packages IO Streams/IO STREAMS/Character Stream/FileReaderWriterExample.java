// This program demonstrates the use of FileReader and FileWriter to read from and write to a text file.
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterExample {
    public static void main(String[] args) {
        String data = "This is an example of FileReader and FileWriter.";

        // Write data to file
        try (FileWriter writer = new FileWriter("fileReaderWriterExample.txt")) {
            writer.write(data);
            System.out.println("Data written to file.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Read data from file
        try (FileReader reader = new FileReader("fileReaderWriterExample.txt")) {
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

// This program writes a string to "fileReaderWriterExample.txt" and then reads it back, displaying the content on the console.