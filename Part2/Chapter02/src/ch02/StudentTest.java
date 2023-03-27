package ch02;

public class StudentTest {

	public static void main(String[] args) {
		
		Student person1 = new Student();
		person1.grade = 1;
		
		System.out.println(person1.grade); // 1
		System.out.println(person1.studentName); // null
		System.out.println(person1.majorCode); // 0
		
		// 멤버변수 초기화 값이 없는 경우 int는 0, String은 null 초기화 됨
	}

}
