package ch13;

public class Employee {
	
	private static int serialNum = 1000;
	
	private int imployyId;
	private String employeeName;
	private String depature;
	
	public Employee() {
		imployyId = ++serialNum;
	}
	
	public int getImployyId() {
		return imployyId;
	}
	
	public void setImployyId(int imployyId) {
		this.imployyId = imployyId;
	}
	
	public String getEmployeeName() {
		return employeeName;
	}
	
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	public String getDepature() {
		return depature;
	}
	
	public void setDepature(String depature) {
		this.depature = depature;
	}

	public static int getSerialNum() {
//		EmployeeName = "asd"; -static 메서드에서는 인스턴스의 변수를 사용할 수 없음;
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		Employee.serialNum = serialNum;
	}
	
	

}
