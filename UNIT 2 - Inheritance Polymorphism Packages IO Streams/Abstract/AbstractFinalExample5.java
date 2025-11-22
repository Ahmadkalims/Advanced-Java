// Abstract class with final method
abstract class Base2 
{
    final void fun()
    {
        System.out.println("Base fun() called");
    }
}

class Derived2 extends Base2
{
	/*void fun()
    {
        System.out.println("Base fun() called");
    }*/
  
}

public class AbstractFinalExample5 
{
    public static void main(String args[])
    {
    	Base2 b = new Derived2();
    	
    	b.fun();
    }
}
