import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamExample {
    public static void main(String[] args) {
        try (FileInputStream inputStream = new FileInputStream("input.bin");
             FileOutputStream outputStream = new FileOutputStream("output.bin")) {
             
            int data;
            while ((data = inputStream.read()) != -1) {
                outputStream.write(data);
            }
            System.out.println("File copied using byte stream.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
