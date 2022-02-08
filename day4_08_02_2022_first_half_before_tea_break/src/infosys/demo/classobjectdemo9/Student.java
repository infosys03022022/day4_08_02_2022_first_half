package infosys.demo.classobjectdemo9;

import java.util.Scanner;
// import is a statment to load the classes or get the class/classes which are in different
// package and we want to include them in the current package.
  
      public class Student  {
    /* roll,name and marks are the instance variables/attributes/members variables/properties.
     we have initialised the members within setData and with displayData we are displaying them. */
/* Why like previous code we are not using the reference.instance_variable_name?
  ans: We are already within the class so no need of creating the object within the class
to access the members.
*/
            int roll;
            String name;
            int marks;

           void setData() {
              roll=1;
              name="Akash";
              marks=100;
           }
    
            void displayData() {
             System.out.println(roll);
             System.out.println(name);
             System.out.println(marks);
           }
  
            public static void main(String s[]){
             Student student=new Student();
             student.setData();
             student.displayData();
                     
    
        }
       }