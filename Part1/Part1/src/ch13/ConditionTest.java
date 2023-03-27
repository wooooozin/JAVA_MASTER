package ch13;

import java.util.Scanner;

public class ConditionTest {

	public static void main(String[] args) {
		
		int max;
		System.out.println("input your number");
		
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		
		max = (x > y) ? x : y;
		System.out.println(max);
		
	}

}
