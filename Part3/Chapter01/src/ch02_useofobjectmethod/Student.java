package ch02_useofobjectmethod;

public class Student implements Cloneable {
	
	private int studentID;
	private String studentName;
	
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
	}
	
	@Override
	public boolean equals(Object object) {
		if (object instanceof Student) {
			Student std = (Student)object;
			if (this.studentID == std.studentID) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return studentID;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	@Override
	public String toString() {
		return studentName;
	}

}
