package ch06;

public class DataTypeTest {

	public static void main(String[] args) {
		
		/*
		변수를 선언하면 해당되는 자료형의 크기 만큼 메모리가 할당
		변수는 할당된 메모리를 가리키는 이름
		 */
		
		int level = 10; // 4바이트 정수형 메모리가 level 이라는 이름으로 할당 됨
//		int num = 12345678900; // The literal 12345678900 of type int is out of range
//		long lnum = 12345678900; // The literal 12345678900 of type int is out of range
		long lnumber = 12345678900L;
		
		System.out.print(level + ", " + lnumber);

	}

}
