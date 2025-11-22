
// This program demonstrates the use of byte streams and character streams in Java for file I/O operations.
import java.io.*;

public class IOStreamExample {

    public static void main(String[] args) {
        // Source file (must exist in the same directory as this program)
        String byteSourceFile = "sourceByteFile.bin";
        String byteDestinationFile = "destinationByteFile.bin";
        String charSourceFile = "sourceTextFile.txt";
        String charDestinationFile = "destinationTextFile.txt";

        // Using byte streams to read and write binary data
        try {
            // Write binary data using FileOutputStream
            FileOutputStream fileOutputStream = new FileOutputStream(byteSourceFile);
            byte[] binaryData = {0x01, 0x02, 0x03, 0x04, 0x05};
            fileOutputStream.write(binaryData);
            fileOutputStream.close();
            System.out.println("Binary data written to " + byteSourceFile);

            // Read binary data using FileInputStream
            FileInputStream fileInputStream = new FileInputStream(byteSourceFile);
            FileOutputStream byteFileCopy = new FileOutputStream(byteDestinationFile);
            int byteData;
            while ((byteData = fileInputStream.read()) != -1) {
                byteFileCopy.write(byteData);
            }
            fileInputStream.close();
            byteFileCopy.close();
            System.out.println("Binary data copied to " + byteDestinationFile);
        } catch (IOException e) {
            System.out.println("Error during byte stream I/O: " + e.getMessage());
        }

        // Using character streams to read and write text data
        try {
            // Write text data using FileWriter
            FileWriter fileWriter = new FileWriter(charSourceFile);
            fileWriter.write("This is an example of character stream.\nThis is another line.");
            fileWriter.close();
            System.out.println("Text data written to " + charSourceFile);

            // Read text data using FileReader
            FileReader fileReader = new FileReader(charSourceFile);
            FileWriter charFileCopy = new FileWriter(charDestinationFile);
            int charData;
            while ((charData = fileReader.read()) != -1) {
                charFileCopy.write(charData);
            }
            fileReader.close();
            charFileCopy.close();
            System.out.println("Text data copied to " + charDestinationFile);
        } catch (IOException e) {
            System.out.println("Error during character stream I/O: " + e.getMessage());
        }
    }
}
