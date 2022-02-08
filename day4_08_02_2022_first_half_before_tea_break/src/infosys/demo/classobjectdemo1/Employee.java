package infosys.demo.classobjectdemo1;


public class Employee {
	 int empId;
	 String name;
	 String designation;
	 String department;
	 int basic;
	
	 void setData() {
		empId=1;
		name="Ravi";
		designation="Manager";
		department="Sales";
		basic=12000;
		
	}
	
	void dispData()
	{
		System.out.println(empId);
		System.out.println(name);
        System.out.println(designation);
        System.out.println(department);
	    System.out.println(basic);
	}
	
	
 public static void main(String[] args) {
		Employee emp=new Employee();
		emp.setData();
		emp.dispData();
		
	}

}
