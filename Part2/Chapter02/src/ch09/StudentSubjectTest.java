package ch09;

public class StudentSubjectTest {

	public static void main(String[] args) {
		
		Student student1 = new Student(100, "loopy");
		student1.setKoreanSubject("국어", 100);
		student1.setMathSubject("수", 75);
		student1.showStudetnScore();
		

	}

}
