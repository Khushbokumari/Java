//Java Program to demonstrate having the main method in   
//another class  
//Creating Student class.  
class Student1{  
 int id;  
 String name;  
}  
//Creating another class TestStudent1 which contains the main method  
class TestStudent2{  
 public static void main(String args[]){  
  Student s2=new Student();  
  System.out.println(s2.id);  
  System.out.println(s2.name);  
 }  
}  
  