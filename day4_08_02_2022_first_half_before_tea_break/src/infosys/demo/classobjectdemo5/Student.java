package infosys.demo.classobjectdemo5;

  
      public class Student  {
    /* roll,name and marks are the instance variables/attributes/members variables/properties
    and within the main method we have initialised the member variable with the data. */
            int roll;
            String name;
            int marks;
  
            public static void main(String s[]){
             Student student=new Student();
             
             // Fully Qualified Name of a class (FQN) the name of a class
             // along with its package name
             // Why we are not writing FQN for student class?
             // We are not writing because our code is already within the package infosys.demo.classobjectdemo5.
             java.util.Scanner scanner=new java.util.Scanner(System.in);
             System.out.println("Enter the roll number");
             student.roll=scanner.nextInt();
             System.out.println("Enter the name");
             student.name=scanner.next();
             System.out.println("Enter the marks");
             student.marks=scanner.nextInt();
             System.out.println(student.roll);
             System.out.println(student.name);
             System.out.println(student.marks);
    
        }
       }