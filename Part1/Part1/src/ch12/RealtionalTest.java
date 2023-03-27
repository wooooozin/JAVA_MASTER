package ch12;

public class RealtionalTest {

	public static void main(String[] args) {
		
		int num1 = 5;
		int num2 = 3;
		
		boolean value = (num1 > num2);
		System.out.println(value);
		
		boolean flag = (num1 > 0) && (num2 > 0);
		flag = (num1 < 0) && (num2 > 0);
		System.out.println(flag);
		
		flag = (num1 > 0) || (num2 > 0);
		System.out.println(flag);
		
		flag = (num1 < 0) || (num2 > 0);
		System.out.println(flag);
		
		flag = !(num1 > 0);
		System.out.println(flag);
		
		
		int num3 = 10;
		int i = 2;
		
		boolean value1 = ((num3 = num3 + 10 ) < 10) && ( ( i = i + 2 ) < 10);
		System.out.println(value);
		System.out.println(num3);
		System.out.println(i);
		
		value = ((num3 = num3 + 10 ) < 10) || ( ( i = i + 2 ) < 10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
	}

}
