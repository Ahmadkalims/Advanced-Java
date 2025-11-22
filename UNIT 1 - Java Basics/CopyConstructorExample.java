class Student2
{
    String name;
    int id;

    Student2(String name, int id)
    {
        this.name = name;
        this.id = id;
    }

    // Copy Constructor
    Student2(Student2 obj2)
    {
        this.name = obj2.name;
        this.id = obj2.id;
    }
}
public class CopyConstructorExample
{

	 public static void main(String[] args)
	    {
	        // This would invoke the parameterized constructor.
	        System.out.println("First Object");
	        Student2 s1 = new Student2("Avinash", 68);
	        System.out.println("StudentName: " + s1.name
	                           + "\nStudentId: " + s1.id);

	        System.out.println();

	        // This would invoke the copy constructor.
	        Student2 s2 = new Student2(s1);
	        System.out.println("Copy Constructor used First Object");
	        System.out.println("StudentName: " + s2.name
	                           + "\nStudentId: " + s2.id);
	        
	        
	        Student2 s3 = new Student2(s2);
	        System.out.println("Copy Constructor used Second Object");
	        System.out.println("StudentName: " + s3.name
	                           + "\nStudentId: " + s3.id);
	        
	        Student2 s4=s1;
	        
	        System.out.println("StudentName: " + s4.name
	                           + "\nStudentId: " + s4.id);
	        
	    }

}
