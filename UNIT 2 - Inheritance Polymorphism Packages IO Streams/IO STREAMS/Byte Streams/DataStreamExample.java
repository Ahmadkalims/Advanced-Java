// this program demonstrates the use of DataInputStream and DataOutputStream
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamExample {
    public static void main(String[] args) {
        // Writing data
        try (DataOutputStream dataOut = new DataOutputStream(new FileOutputStream("data.bin"))) {
            dataOut.writeInt(123);
            dataOut.writeDouble(45.67);
            dataOut.writeBoolean(true);
            System.out.println("Data written using DataOutputStream.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Reading data
        try (DataInputStream dataIn = new DataInputStream(new FileInputStream("data.bin"))) {
            int intValue = dataIn.readInt();
            double doubleValue = dataIn.readDouble();
            boolean booleanValue = dataIn.readBoolean();
            System.out.println("Read Data: " + intValue + ", " + doubleValue + ", " + booleanValue);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

//output:
//Data written using DataOutputStream.
//Read Data: 123, 45.67, true
