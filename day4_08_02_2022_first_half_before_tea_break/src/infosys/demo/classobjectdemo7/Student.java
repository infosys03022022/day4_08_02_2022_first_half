package infosys.demo.classobjectdemo7;

import java.util.Scanner;

  
      public class Student  {
    /* roll,name and marks are the instance variables/attributes/members variables/properties
    and within the main method we have initialised the member variable with the data. */
         
  
            public static void main(String s[]){
             
             Scanner scanner=new Scanner(System.in);
             System.out.println("Enter the roll number");
             int roll=scanner.nextInt();
             System.out.println("Enter the name");
             String name=scanner.next();
             System.out.println("Enter the marks");
             int marks=scanner.nextInt();
             System.out.println(roll);
             System.out.println(name);
             System.out.println(marks);
    
        }
       }