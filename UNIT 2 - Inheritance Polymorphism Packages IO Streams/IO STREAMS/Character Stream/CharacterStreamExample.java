// This program copies the contents of "input.txt" to "output.txt" using character streams.
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamExample {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("input.txt");
             FileWriter writer = new FileWriter("output.txt")) {
             
            int character;
            while ((character = reader.read()) != -1) {
                writer.write(character);
            }
            System.out.println("File copied using character stream.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

//output.txt will contain the same content as input.txt but written using character streams.