package ch06;

public class StudentTest {

	public static void main(String[] args) {

		Student student1 = new Student(1000, "잔망루피", 4);
		String studentInfo = student1.showStudentInfo();
		System.out.println(studentInfo);
		
		Student student2 = new Student();
		System.out.println(student2.showStudentInfo()); // null학생의 학번은 0이고, 0학년 입니다.
		// 디폴트 생성자로 인스턴스를 생성하게되면 타입에 따라 초기 값이 제공됨.
		// 하나 이상의 생성자를 구현했다면 디폴트 생성자는 사용할 수 없고 생성해줘야만 사용가능함 
	}

}
