package ch04_classclass;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class PersonClassTest {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, 
				InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		// - 자료형을 알고 있는 경우 
		Person person = new Person("잔망루피");
		System.out.println(person);
		
		// 3. 클래스 정보 알아보기
		// reflection 프로그래밍 : Class 클래스를 사용하여 클래스의 정보(생성자, 변수, 메서드)등을 알 수 있고 인스턴스를 생성하고,
		// 메서드를 호출하는 방식의 프로그래밍
		// 로컬 메모리에 객체 없는 경우, 원격 프로그래밍, 객체의 타입을 알 수 없는 경우에 사용
		// java.lang.reflect 패키지에 있는 클래스를 활용하여 프로그래밍
		// 일반적으로 자료형을 알고 있는 경우엔 사용하지 않음
		
		Class c = Class.forName("ch04_classclass.Person");
		
		Class[] parameterType = {String.class};
		Constructor cons = c.getDeclaredConstructor(parameterType);
		
		Object[] initargs = {"잔망루피2"};
		Person person2 = (Person)cons.newInstance(initargs);
		System.out.println(person2);
		
		
	}

}
