package ch11;

public class Person {

	private String name;
	private int age;
	
	public Person() { 
		this("이름없음", 10);
	}
	
	public Person(String name, int age) {
		this.setName(name);
		this.setAge(age);
	}
	
	public Person getPerson() {
		return this;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
