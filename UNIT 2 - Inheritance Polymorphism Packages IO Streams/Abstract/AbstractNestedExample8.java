// Abstract class within another class
class Zoo 
{
    abstract class Animal
    {
        abstract void sound();
    }

    class Dog extends Animal
    {
        void sound() 
        {
            System.out.println("Bark");
        }
    }

    class Cat extends Animal
    {
        void sound()
        {
            System.out.println("Meow");
        }
    }
}

public class AbstractNestedExample8
{
	public static void main(String[] args)
	{
        Zoo myZoo = new Zoo();
        Zoo.Animal myAnimal = myZoo.new Dog();
        	myAnimal.sound(); // Output: Meow
        			
        	myAnimal = myZoo.new Cat();
        	myAnimal.sound(); // Output: Bark
    }
}
