package ch03;

import java.awt.geom.Ellipse2D;

public class CustomerTest {

	public static void main(String[] args) {

		Customer loopy = new Customer(1, null);
		loopy.setCustomerName("LOOPY");
		loopy.setCustomerID(10010);
		loopy.bonusPoint = 1000;
		loopy.showCustomerInfo();
		
		VIPCustomer vipCustomer = new VIPCustomer(0, null);
		vipCustomer.setCustomerName("리치맨");
		vipCustomer.setCustomerID(10011);
		vipCustomer.bonusPoint = 10000;
		vipCustomer.showCustomerInfo();
		
		Customer lee = new VIPCustomer(1002, "LEE");
		// Customer 타입의 변수만 사용가능
		// 인스턴스 메서드는 사용 가
		
		System.out.println(vipCustomer.showCustomerInfo());
		int cost = vipCustomer.calcPrice(1000);
		System.out.println(cost);
		
		
	}

}
