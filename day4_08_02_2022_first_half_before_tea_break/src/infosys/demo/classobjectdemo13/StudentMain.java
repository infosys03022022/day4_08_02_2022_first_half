
 package infosys.demo.classobjectdemo13;

   class  Student {
      private int roll;
      String name;
      public int marks;

      public void setData() {
              roll=1;
              name="Akash";
              marks=100;
           }
    
      public void displayData() {
             System.out.println(roll);
             System.out.println(name);
             System.out.println(marks);
           }
 
   } // end of Student class
  
   
   
   public class StudentMain {
            
            public static void main(String s[]){
             Student student=new Student();
            // System.out.println(student.roll);  
             // roll is not accessible as roll is 
             //the private member of the Student class and we are trying to access it from a different class StudentMain 
             System.out.println(student.marks);
             System.out.println(student.name);
             student.setData();
             student.displayData();
            }
       }  // end of StudentMain