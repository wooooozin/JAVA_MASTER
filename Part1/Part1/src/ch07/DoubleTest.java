package ch07;

public class DoubleTest {

	public static void main(String[] args) {

		double dNum = 3.14;
		float fNum = 3.14F;
		
		System.out.println(dNum);
		System.out.println(fNum);
		
		double dNum1 = 1;
		
		for(int i = 0; i<10000; i++) {
			dNum1 = dNum1 + 0.1;
		}
		System.out.println(dNum1); // 1001.000000000159
		// 지수와 가수로 나타내는 부동 소수점 방식에서는 지수부가 0을 표현할 수 없기 때문에 약간의 오차가 발생할 수 있다
		
	}

}
