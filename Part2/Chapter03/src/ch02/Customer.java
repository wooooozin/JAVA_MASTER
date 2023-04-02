package ch02;

public class Customer {
	
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	
	int bonusPoint;
	double bonusRatio;
	
	String agentID;
	
//	public Customer() {
//		customerGrade = "Silver";
//		bonusRatio = 0.01;
//		
//		System.out.println("Customer call");
//	}
	
	public Customer(int custoerID, String customerName) {
		this.customerID = custoerID;
		this.customerName = customerName;
		
		customerGrade = "Silver";
		bonusRatio = 0.01;
		
		System.out.println("Customer call");
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}	
	
	public void showCustomerInfo() {
		System.out.println(customerName + "님의 등급은 " + customerGrade + "이며 보너스 포인트는 " + bonusPoint + "입니다.");
	}
	
}
