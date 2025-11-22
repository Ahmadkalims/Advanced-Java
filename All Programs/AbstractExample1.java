
abstract class Info
{
    abstract void printInfo();
    void add(int a, int b)
    {
    	int c = a+b;
    	System.out.println(c);
    }
    static void sub(int a, int b)
    {
    	int c=a-b;
    	System.out.println(c);
    }
    final void mul(int a, int b)
    {
    	int c=a*b;
    	System.out.println(c);
    }
    //abstract void sub2();
}

// Abstraction performed using extends
class Employee extends Info
{
    void printInfo()
    {
        String name = "avinash";
        int age = 21;
        float salary = 222.2F;

        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
    }
   /* void mul(int x, int y)
    {
    	
    }*/
}

// Base class
class AbstractExample1
{
    public static void main(String args[])
    {
    	// We can have references of Info type.
    	//Info s1 = new Info();
        Employee s = new Employee();
        s.printInfo();
        Info.sub(10,5);
        s.add(20, 45);
        s.mul(45, 2);
    }
}

