package ch04_classclass;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class StringTest {

	public static void main(String[] args) throws ClassNotFoundException {
		
		// 1. Class 클래스
		// 자바의 모든 클래스와 인터페이스는 컴파일 후 class 파일이 생성됨
		// Class 클래스는 컴파일 된 class 파일을 로드하여 객체를 동적 로드하고, 정보를 가져오는 메서드가 제공됨
		// Class.forName("클래스 이름") 메서드로 클래스를 동적으로 로드 함
		
		// Class.forName("클래스 이름") 메서드로 클래스를 동적으로 로드 함 
		Class c = Class.forName("java.lang.String");
		System.out.println(c.getName()); // java.lang.String

		
		//  클래스 이름으로 직접 Class 클래스 가져오기
		Class c1 = String.class;
		System.out.println(c1.getName()); // java.lang.String

		
		// 생성된 인스턴스에서 Class 클래스 가져오기
		String s = new String();
		Class c2 = s.getClass();
		System.out.println(c2.getName()); // java.lang.String
		
		// 2. 동적 로딩
		// 컴파일 시에 데이터 타입이 binding 되는 것이 아닌, 실행(runtime) 중에 데이터 타입을 binding 하는 방법
		// 프로그래밍 시에는 문자열 변수로 처리했다가 런타임시에 원하는 클래스를 로딩하여 binding 할 수 있다는 장점
		// 컴파일 시에 타입이 정해지지 않으므로 동적 로딩시 오류가 발생하면 프로그램의 심각한 장애가 발생가능
		
		Constructor[] constructors = c.getConstructors();
		for (Constructor con : constructors ) {
			System.out.println(con); // 여러 생성자들 출력
		}
		
		Method[] methods = c.getMethods();
		for (Method method : methods) {
			System.out.println(method); // 여러 메서드 출력
		}
		
		
	}

}
