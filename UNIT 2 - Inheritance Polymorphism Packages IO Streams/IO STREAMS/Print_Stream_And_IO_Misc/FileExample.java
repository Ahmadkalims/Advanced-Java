
// This program demonstrates basic file operations in Java
import java.io.File;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) {
        File file = new File("exampleFile.txt");

        // Check if the file exists
        if (!file.exists()) {
            try {
                file.createNewFile();
                System.out.println("File created: " + file.getName());
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        } else {
            System.out.println("File already exists.");
        }

        // Display file information
        System.out.println("File path: " + file.getAbsolutePath());
        System.out.println("File size: " + file.length() + " bytes");
        System.out.println("Is file readable? " + file.canRead());
        System.out.println("Is file writable? " + file.canWrite());
    }
}
