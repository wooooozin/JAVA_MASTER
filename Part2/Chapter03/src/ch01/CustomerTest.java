package ch01;

public class CustomerTest {

	public static void main(String[] args) {

		Customer loopy = new Customer();
		loopy.setCustomerName("LOOPY");
		loopy.setCustomerID(10010);
		loopy.bonusPoint = 1000;
		loopy.showCustomerInfo();
		
		VIPCustomer vipCustomer = new VIPCustomer();
		vipCustomer.setCustomerName("리치맨");
		vipCustomer.setCustomerID(10011);
		vipCustomer.bonusPoint = 10000;
		vipCustomer.showCustomerInfo();
		
	}

}
