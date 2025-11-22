// This program demonstrates the use of ObjectInputStream and ObjectOutputStream to serialize and deserialize objects in Java.
import java.io.*;

class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + '}';
    }
}

public class ObjectStreamExample {
    public static void main(String[] args) {
        // Writing object
        try (ObjectOutputStream objectOut = new ObjectOutputStream(new FileOutputStream("person.dat"))) {
            Person person = new Person("Alice", 30);
            objectOut.writeObject(person);
            System.out.println("Object written using ObjectOutputStream.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Reading object
        try (ObjectInputStream objectIn = new ObjectInputStream(new FileInputStream("person.dat"))) {
            Person person = (Person) objectIn.readObject();
            System.out.println("Read Object: " + person);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

// This program serializes a Person object to "person.dat" and then deserializes it back, displaying the object's details on the console.
//output will be:
// Object written using ObjectOutputStream.
// Read Object: Person{name='Alice', age=30}