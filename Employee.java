
public class Employee {
	
	int id;
	String Name;
	int age;
	int phone;
	String department;
	
	

	public static void main(String[] args) {
 
		Employee emp=new Employee();
		System.out.println(emp);
		emp.id=1;
		emp.Name="Tadess";
		emp.age=51;
		emp.phone=56546;
		emp.department="Admin";
		System.out.println(emp.id);
		System.out.println(emp.Name);
		System.out.println(emp.age);
		System.out.println(emp.phone);
		System.out.println(emp.department);
			
		 
		
	}

}
