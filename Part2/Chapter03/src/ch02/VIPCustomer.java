package ch02;

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

}
