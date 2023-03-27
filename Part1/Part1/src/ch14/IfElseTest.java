package ch14;

import java.util.Scanner;

public class IfElseTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int x = scanner.nextInt();
		
		if (x >= 8 && x < 20) {
			System.out.println("의무교육 대상자 입니다.");
		}
		else if (x >= 20) {
			System.out.println("성인입니다.");
		}
		else {
			System.out.println("유치원 어린이집에 가세요.");
		}

	}

}
