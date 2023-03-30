package ch14;

import java.util.Calendar;

public class CompanyTest {

	public static void main(String[] args) {

		Company company1 = Company.getInstance();
		Company company2 = Company.getInstance();
		
		System.out.println(company1 == company2);
		
		
		
	}

}
