// Example of Parameterized Constructor in Java
class Student1
{
    String name;
    int id;
    int age;
  
    Student1()
	{
    	System.out.println("Default");
    }
    
    Student1(String n, int i)
    {
        name = n;
        id = i;
    }
    Student1(String n)
    {
        name = n;
    }
}

public class ParameterizedConstructorExample 
{
    public static void main(String[] args)
    {
        Student1 s1 = new Student1();
        Student1 s2 = new Student1("Avinash", 68);
        System.out.println("StudentName: " + s2.name
                           + "...StudentId: " + s2.id+"...StudentAge: " + s2.age);
        Student1 s3 = new Student1("Kailash");
        System.out.println("StudentName: " + s3.name
                + "...StudentId: " + s3.id+"...StudentAge: " + s3.age);
    }
}

//Output:
//Default
//StudentName: Avinash...StudentId: 68...StudentAge: 0
//StudentName: Kailash...StudentId: 0...StudentAge: 0