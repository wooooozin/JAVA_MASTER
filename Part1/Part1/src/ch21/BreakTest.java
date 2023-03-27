package ch21;

public class BreakTest {

	public static void main(String[] args) {

		// 1부터 숫자를 더하여 100이 넘는 순간의 그 숫자와 합을 출력하세요
		
		int sum = 0;
		
		for (int i = 0; ; i++) {
			sum += i;
			if (sum >= 100) {
				break;
			}
		}
		System.out.println(sum);
	}

}
