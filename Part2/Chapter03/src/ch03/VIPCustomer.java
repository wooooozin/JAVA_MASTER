package ch03;

public class VIPCustomer extends Customer {
	
	private int agentID;
	double salseRatio;
	
	public VIPCustomer(int customerID, String name) {
		
		super(customerID, name);
//		super();
		customerGrade = "VIP";
		salseRatio = 0.05;
		bonusRatio = 0.1;
		
		System.out.println("VIP Customer");
	}
	
	public int getAgentID() {
		return agentID;
	}
	
	// method overriding

	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price  - (int)(price * salseRatio);
	}

	@Override
	public String showCustomerInfo() {

		return super.showCustomerInfo() + "상담원의 아이디는 " + agentID;
	}	
	
	

}
