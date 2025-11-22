// Example of a Parameterized Constructor and default toString() method in Java
class ParametrizedConstructorStudent
{  
 int rollno;  
 String name;  
 String city;  
  
 ParametrizedConstructorStudent(int rollno, String name, String city)
 {  
	 this.rollno=rollno;  
	 this.name=name;  
	 this.city=city;  
 }  
  
 public static void main(String args[])
 {  
   ParametrizedConstructorStudent s1=new ParametrizedConstructorStudent(101,"Raj","lucknow");  
   ParametrizedConstructorStudent s2=new ParametrizedConstructorStudent(102,"Vijay","ghaziabad");  
     
   System.out.println(s1);//compiler writes here s1.toString()  
   System.out.println(s2);//compiler writes here s2.toString()  
 }  
}

//Output:
//ParametrizedConstructorStudent@15db9742