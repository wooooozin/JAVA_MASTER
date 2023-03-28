package ch03;

public class FunctionTest {

	public static void main(String[] args) {
		
		int n1 = 10;
		int n2 = 20;
		
		int total = addNum(n1, n2);
		System.out.println(total);
		
		sayHello("안녕하세요!");
		int sum = calcSum();
		System.out.println(sum);
		
	}
	
	// 반환 값 매개변수가 있는 함
	public static int addNum(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
	
	// 문자열을 출력하고 반환값이 없는 함수
	public static void sayHello(String greeting) {
		System.out.println(greeting);
	}
	
	// 반환 값이 있고 매개변수가 없는 함수
	public static int calcSum() {
		int sum = 0;
		int i;
		
		for (i = 0; i <= 100; i++) {
			sum += i;
		}
		return sum;
	}
	

}
