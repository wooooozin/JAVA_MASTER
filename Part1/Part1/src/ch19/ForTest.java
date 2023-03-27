package ch19;

public class ForTest {

	public static void main(String[] args) {
		
		// 1부터 10까지 더한 결과를 출력하세요
		
		// for
		int count = 1;
		int sum = 0;
		
		for (int i = 0; i < 10; i++, count++) {
			sum += count;
		}
		System.out.println(sum);
		
		
		// while
		
		int num = 1;
		int total = 0;
		
		while( num <= 10) {
			total += num;
			num++;
		}
		System.out.println(total); 
		
	}

}
