import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamExample {
    public static void main(String[] args) {
        String data = "Example data for FileInputStream and FileOutputStream.";

        // Write data to file
        try (FileOutputStream fos = new FileOutputStream("fileStreamExample.txt")) {
            fos.write(data.getBytes());
            System.out.println("Data written to file.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Read data from file
        try (FileInputStream fis = new FileInputStream("fileStreamExample.txt")) {
            int content;
            while ((content = fis.read()) != -1) {
                System.out.print((char) content);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
