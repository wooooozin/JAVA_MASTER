package ch06;

public class Student {
	
	// 멤버변수
	public int studentID;
	public String studentName;
	public int studentGrade;
	
	// 초기화 - constructor
	public Student(int id, String name, int grade) {
		this.studentID = id;
		this.studentName = name;
		this.studentGrade = grade;
	}
	// default 생성자
	public Student() { }

	// 메서드
	public String showStudentInfo() {
		return studentName + "학생의 학번은 " + studentID + "이고, " + studentGrade + "학년 입니다.";
	}
	
}
