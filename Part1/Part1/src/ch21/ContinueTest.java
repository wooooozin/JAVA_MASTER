package ch21;

public class ContinueTest {

	public static void main(String[] args) {
		
		// 3의 배수 출력
		
		int num;
		
		for (num = 1; num < 100; num++) {
			if ((num % 3) != 0) {
				continue;
			}
			System.out.println(num);
		}

	}

}
