package ch04;

public class StrudentTest {

	public static void main(String[] args) {

		Student student1 = new Student(); // Student클래스 타입의 학생1의 객체, 인스턴스를 생성 
		student1.setStudentName("잔망루피");
//		student1.studentName = "잔망루피";
		student1.studentID = 1000;
		student1.address = "서울";
		student1.showStudentInfo();
		
		Student student2 = new Student();
		student2.studentID = 1001;
		student2.studentName = "크롱";
		student2.address = "부산";
		student2.showStudentInfo();
		
		System.out.println(student1); // ch04.Student@7ad041f3 - 주소 출력
		System.out.println(student2); // ch04.Student@251a69d7 - 주소 출력
	}

}
