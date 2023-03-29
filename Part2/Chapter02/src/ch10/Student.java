package ch10;

public class Student {

	private int studentID;
	String studentName;
	
	Subject korean;
	Subject math;
	
	public Student(int id, String name) {
		this.setStudentID(id);
		this.studentName = name;
		
		korean = new Subject();
		math = new Subject();
	}
	
	public void setKoreanSubject(String name, int score) {
		korean.subjectName = name;
		korean.score = score;
	}
	
	public void setMathSubject(String name, int score) {
		math.subjectName = name;
		math.score = score;
	}
	
	public void showStudetnScore() {
		int total = korean.score + math.score;
		System.out.println(studentName + " 학생의 총점 " + total + "점 입니다.");
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
}
