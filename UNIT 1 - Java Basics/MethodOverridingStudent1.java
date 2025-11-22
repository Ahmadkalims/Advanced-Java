//	Example of toString() method overriding in Java
class MethodOverridingStudent1
{  
 int rollno;  
 String name;  
 String city;  
  
 MethodOverridingStudent1(int rollno, String name, String city)
 {  
	 this.rollno=rollno;  
	 this.name=name;  
	 this.city=city;  
 }  
   
 public String toString()
 {
	 //overriding the toString() method  
	 return rollno+" "+name+" "+city;  
 }  
 public static void main(String args[])
 {  
   MethodOverridingStudent1 s1=new MethodOverridingStudent1(101,"Raj","lucknow");  
   MethodOverridingStudent1 s2=new MethodOverridingStudent1(102,"Vijay","ghaziabad");  
	 
   System.out.println(s1);//compiler writes here s1.toString()  
   System.out.println(s2);//compiler writes here s2.toString()  
 }  
}  

//Output:
//101 Raj lucknow
//102 Vijay ghaziabad