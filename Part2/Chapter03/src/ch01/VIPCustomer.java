package ch01;

public class VIPCustomer extends Customer {
	
	private int agentID;
	double salseRatio;
	
	public VIPCustomer() {
		customerGrade = "VIP";
		salseRatio = 0.05;
		bonusRatio = 0.1;
	}
	
	public int getAgentID() {
		return agentID;
	}

}
