// Abstract class without abstract method
abstract class Base1 
{
	void fun()
    {
		System.out.println("Function of Base class is called");
    }
}

class Derived1 extends Base1 
{
    // This class only inherits the Base class methods and properties
}

public class AbstractWithoutAbstractMethodExample4
{
    public static void main(String args[])
    {
        Derived1 d = new Derived1();
        
        d.fun();
    }
}
