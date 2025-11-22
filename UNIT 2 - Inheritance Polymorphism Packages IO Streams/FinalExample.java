// Example of final keyword in Java
/*final class A
{
     // methods and fields
}
// The following class is illegal
class B extends A 
{ 
    // COMPILE-ERROR! Can't subclass A
}*/
/*class A 
{
    final void m1() 
    {
        System.out.println("This is a final method.");
    }
}
class B extends A 
{
    void m1()
    { 
        // Compile-error! We can not override
        System.out.println("Illegal!");
    }
}*/
// Example of final variables in Java
class Example
{
	final int THRESHOLD = 5;
    
    
    final int CAPACITY;
    
    
    final int  MINIMUM;
    
    
    static final double PI = 3.141592653589793;
    
    
    static final double EULERCONSTANT;
    
    
    {
        CAPACITY = 25;
    }
    
   
    static
    {
        EULERCONSTANT = 2.3;
    }
    
    public Example() 
    {
        MINIMUM = -1;
    }
    
    public Example(int a)
    {
    	MINIMUM = a;
    }
        
}
class MyClass 
{
    final String message = "Hello!"; 
    
    void printMessage() 
    {
        System.out.println(message);
    }
    
    void printFinalMessage() 
    {
        final String finalMessage = "Hello, final!";
        System.out.println(finalMessage);
    }
}


public class FinalExample
{
	public static void main(String[] args)
	{
		final double PI = 3.14159;
		
		System.out.println("Value of PI: " + PI);
		

		final StringBuilder sb = new StringBuilder("Piyush");

        // Printing the element in StringBuilder object
        System.out.println(sb);

        // changing internal state of object reference by
        //  final reference variable sb
        sb.append(" Kumar Gupta");

        // Again printing the element in StringBuilder
        // object after appending above element in it
        System.out.println(sb);
        
        final int VALUE = 10; 
        //int x;
        //x = VALUE + 10;
        
        System.out.println("The value is: " + VALUE);
        // VALUE = 20; 
        // System.out.println("The new value is: " + VALUE);
        
        final String MESSAGE = "Hello, world!"; 
        System.out.println(MESSAGE);
        
        MyClass myObj = new MyClass();
        myObj.printMessage();
        myObj.printFinalMessage();
		
	}

}
