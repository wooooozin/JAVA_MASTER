package ch13;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee employeeLee = new Employee();
		System.out.println(Employee.getSerialNum());
		System.out.println(employeeLee.getImployyId());
		
		Employee employee2 = new Employee();
		System.out.println(Employee.getSerialNum());
		System.out.println(employee2.getImployyId());
	}

}
