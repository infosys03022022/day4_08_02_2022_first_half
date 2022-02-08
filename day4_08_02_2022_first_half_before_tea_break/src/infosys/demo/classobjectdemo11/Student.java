package infosys.demo.classobjectdemo11;

import java.util.Scanner;
// import is a statment to load the classes or get the class/classes which are in different
// package and we want to include them in the current package.
  
      public class Student  {
    /* roll,name and marks are the instance variables/attributes/members variables/properties.
     we have initialised the members within setData and with displayData we are displaying them. */
/* Why like previous code we are not using the reference.instance_variable_name?
  ans: We are already within the class so no need of creating the object within the class
to access the members.
 So in the code we have used private as access specifier , so the access specifier is of private.
private is accessible within the same class*/

           private int roll;
           private String name;
           private int marks;

           private void setData() {
              roll=1;
              name="Akash";
              marks=100;
           }
    
           private void displayData() {
             System.out.println(roll);
             System.out.println(name);
             System.out.println(marks);
           }
  
            public static void main(String s[]){
             Student student=new Student();
             student.setData();
             student.displayData();   // 1 Akash 100
             Student student2=new Student();
             student2.displayData(); // 0 null 0// because of the default constructor
             student2.roll=2;
             student2.name="Suresh";
             student2.marks=40;
             student2.displayData(); // 2 Suresh 40   
             student.setData();
             student.displayData(); // 1 Akash 100
    
        }
       }