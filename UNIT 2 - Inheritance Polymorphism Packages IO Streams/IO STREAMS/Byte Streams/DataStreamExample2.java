// this program demonstrates the use of DataInputStream and DataOutputStream
import java.io.*;

public class DataStreamExample2 
{
    public static void main(String[] args) 
    {
        try 
        {
            // Write data
            DataOutputStream dos = new DataOutputStream
            		(new FileOutputStream("data.dat"));
            dos.writeInt(101);
            dos.writeDouble(98.76);
            dos.writeUTF("Java Streams");
            dos.close();

            // Read data
            DataInputStream dis = new DataInputStream
            		(new FileInputStream("data.dat"));
            System.out.println("ID: " + dis.readInt());
            System.out.println("Score: " + dis.readDouble());
            System.out.println("Message: " + dis.readUTF());
            dis.close();
        }
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
}

//output:
//ID: 101
//Score: 98.76
//Message: Java Streams