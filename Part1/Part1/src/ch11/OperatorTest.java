package ch11;

public class OperatorTest {

	public static void main(String[] args) {
		System.out.println(5 / 3); // 1
		System.out.println(5 % 3); // 2
		
		int val = 1;
		int num = 100;
		
		val = ++num; // 먼저 num이 +1 증가하고 val 변수에 대입 
		System.out.println(val); // 101
		System.out.println(num); // 101
		
		val = num++; // 먼저 val 변수에 num을 대입하고 num +1
		System.out.println(val); // 101
		System.out.println(num); // 102
		
	}

}
