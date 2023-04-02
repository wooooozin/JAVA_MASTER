package ch04;

public class Person {
	
	String name;
	int age;
	String job;
	
	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
	public void showJobInfo() {
		System.out.println(name + "의 직업은 " + job + "입니다.");
	}
	

}
