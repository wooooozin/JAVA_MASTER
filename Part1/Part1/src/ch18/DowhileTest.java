package ch18;

import java.util.Scanner;

public class DowhileTest {

	public static void main(String[] args) {
		
		// do-while은 조건과 상관 없이 수행을 한 번 하고나서 조건을 체크		
		// 입력받는 모든 숫자의 합을 구하는 예제 단, 입력이 0이 되면 반복을 그만하고 합을 출력
		
		Scanner scanner = new Scanner(System.in);
		
		int input;
		int sum = 0;
		
		do {
			input = scanner.nextInt();
			sum += input;
		} while (input != 0);

			
		System.out.println(sum);
		
	}

}
