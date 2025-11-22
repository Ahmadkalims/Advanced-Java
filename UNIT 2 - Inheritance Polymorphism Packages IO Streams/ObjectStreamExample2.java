import java.io.*;

// Step 1: Class must implement Serializable
class Student implements Serializable 
{
    int id;
    String name;
    double marks;

    Student(int id, String name, double marks) 
    {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
}

public class ObjectStreamExample2 
{
    public static void main(String[] args) 
    {
        // Serialize object
        try (ObjectOutputStream oos = new ObjectOutputStream
        		(new FileOutputStream("student.ser")))
        {
            Student s = new Student(101, "Piyush", 95.5);
            oos.writeObject(s);
            System.out.println("Object serialized successfully.");
        }
        catch (IOException e) 
        {
            e.printStackTrace();
        }

        // Deserialize object
        try (ObjectInputStream ois = new ObjectInputStream
        		(new FileInputStream("student.ser"))) 
        {
            Student s2 = (Student) ois.readObject();
            System.out.println("Object deserialized: " + s2.id + ", " 
            + s2.name + ", " + s2.marks);
        }
        catch (IOException | ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}
