// This program demonstrates the use of 'super' keyword to access parent class members in Java.
class Animal
{
	String color="white";  
}  
class Dog extends Animal
{
	String color="black";
	void printColor()
	{
		System.out.println(color);//prints color of Dog class
		System.out.println(super.color);//prints color of Animal class
	}  
}  
class Super1
{
	public static void main(String args[])
	{
		Dog d=new Dog();
		d.printColor();
	}
}  