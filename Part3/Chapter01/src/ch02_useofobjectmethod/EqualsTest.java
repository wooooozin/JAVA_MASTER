package ch02_useofobjectmethod;

public class EqualsTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		// 1. equals() 메서드
		// 두 인스턴스의 주소 값을 비교하여 true/false를 반환
		// 인스턴스가 다르더라도 논리적으로 동일한 경우 true를 반환하도록 재정의 할 수 있음 (ex: 학번, 주민번호, 아이디 등)
		
		Student loopy = new Student(1001, "루피");
		Student loopy2 = loopy;
		Student kiki = new Student(1001, "루피");
		
		System.out.println(loopy.equals(loopy2));
		System.out.println(loopy == loopy2);
		
		// studentID가 같을 때 같다고 재정의 해 사용하게 되면 
		System.out.println(loopy.equals(kiki)); // true
		System.out.println(loopy == kiki); // false
		
		
		// 2. hashCode()는 인스턴스의 저장 주소를 반환함
		// hash : 정보를 저장, 검색하는 자료구조
		// 두 인스턴스가 같다는 것은? - 두 인스턴스에 대한 equals()의 반환 값이 true, 동일한 hashCode() 값을 반환
		// 논리적으로 동일함을 위해 equals() 메서드를 재정의 하였다면,  hashCode()메서드도 재정의 하여 동일한 hashCode 값이 반환되도록 한다
		
		// hashCode() 재정의 전,
		System.out.println(loopy.hashCode()); // 2060468723
		System.out.println(kiki.hashCode()); // 622488023
		
		// hashCode() 재정의 후
		System.out.println(loopy.hashCode()); // 1001
		System.out.println(kiki.hashCode()); // 1001
		
		System.out.println(System.identityHashCode(loopy)); // 2060468723
		System.out.println(System.identityHashCode(kiki)); // 622488023
		
		// 3. clone() - 객체의 원본을 복제하는데 사용하는 메서드
		// 생성과정의 복잡한 과정을 반복하지 않고 복제 할 수 있음
		// clone()메서드를 사용하면 객체의 정보(멤버 변수 값등...)가 동일한 또 다른 인스턴스가 생성되는 것이므로, 
		// 객체 지향 프로그램에서의 정보 은닉, 객체 보호의 관점에서 위배될 수 있음
		// 해당 클래스의 clone() 메서드의 사용을 허용한다는 의미로 cloneable 인터페이스를 명시
		
		Student uzi = (Student)loopy.clone();
		System.out.println(uzi.toString());
	}

}
