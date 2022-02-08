package infosys.demo.classobjectdemo12;
  /*  Currently main method is not present in the Student class. We created a separate class
to have the main method and the class is StudentMain. 
Q Can we access the default member of the  StudentClass from the main method StudentMain class?
A Yes we can access the default and the public member of Student class from the main method
of StudentMain 
Q What about the access specifier of Student and StudentMain?
A the access specifier of Student is default and the access specifier of StudentMain public.
Q What will be file name for the following code?
A The file name will be StudentMain as StudentMain is the public class. 
Q Can we make both the class as public in the same file?
A No.
[ Conclusion: We have to give the class name and file name same if the class is with public 
access specifier. Now if multiple classes are public for example in a file we wrote public class Student{} public class Employee {}. Now what name we are going to give to the file because
we have two public classes. We try to keep the class which is having the main method as public.]
      */
import java.util.Scanner;
      
 class Student  {
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
 
   } // end of Student class
 


         public class StudentMain {
            
            public static void main(String s[]){
             Student student=new Student();
            
             student.setData();
             System.out.println(student.roll);
             student.displayData();
            }
       }  // end of StudentMain
