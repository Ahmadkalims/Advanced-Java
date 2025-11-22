// This program demonstrates various features of interfaces in Java
interface A
{
	final int a = 10;
	
	
	
    static void display()
    {
        System.out.println("I am static method in interface.");
        show();
    }
    
    private void view()
    {
    	System.out.println("I am private method in interface.");    	
    }
    
    private static void show()
    {
    	System.out.println("I am private and static method in interface.");    	
    }
    
    default void outPut()
    {
    	view();
    }
    void method1();
    void method2();
}

interface B extends A 
{
	
	default void display()
	{
        System.out.println("hello");
    }
	
    void method3();
}


public class InterfaceExample implements B
{
	public void method1()
	{
        System.out.println("Method 1");
    }
  
    public void method2()
    {
        System.out.println("Method 2");
    }
  
    public void method3()
    {
        System.out.println("Method 3");
    }
    
    public static void main(String[] args)
    {
    	
    	InterfaceExample x = new InterfaceExample();
    	
    	x.method1();
    	x.method2();
    	x.method3();
    	
    	x.display();
    	A.display();
    	x.outPut();
    }

}
