// Example of Static Method in Java
class Student
{  
     int rollno;  
     String name;
     
     static String college = "ITS";
     
     //static method to change the value of static variable  
     static void change()
     {  
    	 college = "BBDIT";  
     }  
     
       
     Student(int r, String n)
     {  
    	 rollno = r;  
    	 name = n;  
     }  
       
     void display()
     {
    	 System.out.println(rollno+" "+name+" "+college);
     }  
}  

public class StaticMethodTest
{  
    public static void main(String args[])
    {
    	Student.change();//calling change method
    	
    	Student s1 = new Student(111,"Karan");
    	Student s2 = new Student(222,"Aryan");
    	Student s3 = new Student(333,"Sonoo");
    	
    	s1.display();
    	s2.display();
    	s3.display();  
    }  
} 

// Output:
// 111 Karan BBDIT
// 222 Aryan BBDIT
// 333 Sonoo BBDIT  