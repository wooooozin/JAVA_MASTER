package ch03_stringclass;

public class StringTest {

	public static void main(String[] args) {
		
		// 1. String 클래스
		// 힙 메모리에 인스턴스로 생성되는 경우와 상수 풀(constant pool)에 있는 주소를 참조하는 두 가지 방법
		// 힙 메모리는 생성될때마다 다른 주소 값을 가지지만, 상수 풀의 문자열은 모두 같은 주소 값을 가짐
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1 == str2); // false	
		String str3 = "123";
		String str4 = "123";
		
		System.out.println(str3 == str4); // true
		
		// 한번 생성된 String은 불변(immutable)
		// String을 연결하면 기존의 String에 연결되는 것이 아닌 새로운 문자열이 생성됨 ( 메모리 낭비가 발생할 수도 )
		
		String java = new String("java");
		String android = new String("android");
		
		System.out.println(System.identityHashCode(java)); // 498931366
		
		java = java.concat(android);
		
		System.out.println(java); // javaandroid
		System.out.println(System.identityHashCode(java)); // 2060468723
	}

}
