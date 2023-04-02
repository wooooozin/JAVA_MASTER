package ch04;

public class Artist extends Person {

	public Artist(String name, String job) {
		super(name, job);
		super.age = 20;
	}

	@Override
	public void showJobInfo() {
		System.out.println("재정의된 메서드 입니다.");
		super.showJobInfo();
	}
	
	

}
