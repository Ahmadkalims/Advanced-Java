// Example of using BufferedInputStream and BufferedOutputStream in Java
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStreamExample {
    public static void main(String[] args) {
        try (BufferedInputStream bufferedInput = new BufferedInputStream(new FileInputStream("input.bin"));
             BufferedOutputStream bufferedOutput = new BufferedOutputStream(new FileOutputStream("output.bin"))) {
             
            int data;
            while ((data = bufferedInput.read()) != -1) {
                bufferedOutput.write(data);
            }
            System.out.println("File copied using buffered stream.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
