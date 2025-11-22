import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamExample {
    public static void main(String[] args) {
        try (PrintStream printStream = new PrintStream(new FileOutputStream("printStream.txt"))) {
            printStream.println("Hello, PrintStream!");
            printStream.printf("Number: %d, String: %s%n", 42, "Java I/O");
            System.out.println("Data written using PrintStream.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
