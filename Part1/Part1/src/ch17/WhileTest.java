package ch17;

public class WhileTest {

	public static void main(String[] args) {
		
		// • 1부터 10까지 더하여 그 결과를 출력해 보자
		
		int num = 1;
		int sum = 0;
		
		while (num <= 10) {
			sum += num;
			num++;
		}
		
		System.out.println(num); // 11
		System.out.println(sum); // 55
		
		// 특정 온도까지 가동되는 에어컨
		
		int temp = 24;
		int hopeTemp = 18;
		int count = 0;
		
		while (temp > hopeTemp) {
			temp--;
			count++;
			System.out.println(temp);
		}
		
		System.out.println("에어컨 가동응ㄹ 멈춥니다.");
		System.out.println(count);
		System.out.println(temp);
	}

}
