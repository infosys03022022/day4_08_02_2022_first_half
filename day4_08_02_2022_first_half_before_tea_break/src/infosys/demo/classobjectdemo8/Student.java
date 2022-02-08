package infosys.demo.classobjectdemo8;

import java.util.Scanner;
// import is a statment to load the classes or get the class/classes which are in different
// package and we want to include them in the current package.
  
      public class Student  {
    /* roll,name and marks are the instance variables/attributes/members variables/properties
    and within the main method we have initialised the member variable with the data. */
            int roll;
            String name;
            int marks;
  
            public static void main(String s[]){
             Student student=new Student();
             
             // Fully Qualified Name of a class (FQN) the name of a class
             // along with its package name is not required if we are writing the import statement.
          
             Scanner scanner=new Scanner(System.in);
             
             System.out.println("Enter the roll number");
             student.roll=scanner.nextInt();
             System.out.println("Enter the name");
             student.name=scanner.next();
             System.out.println("Enter the marks");
             student.marks=scanner.nextInt();
             System.out.println(student.roll);
             System.out.println(student.name);
             System.out.println(student.marks);

             Student student2=new Student();
             System.out.println("Enter the roll number");
             student2.roll=scanner.nextInt();
             System.out.println("Enter the name");
             student2.name=scanner.next();
             System.out.println("Enter the marks");
             student2.marks=scanner.nextInt();
             System.out.println(student2.roll);
             System.out.println(student2.name);
             System.out.println(student2.marks);

         
    
        }
       }