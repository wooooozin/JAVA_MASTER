package ch06;

public abstract class Computer {
	
	//추상 클래스 - 구현 코드 없이 메서드의 선언만 있는 추상 메서드(abstract method)를 포함한 클래스
	// 추상 클래스는 new 할 수 없음 ( 인스턴스화 할 수 없음)
	
	// 추상 메서드
	abstract void display();
	abstract void typing();
	
	public void turnOn() {
		System.out.println("컴퓨터 전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("컴퓨터 전원을 끕니다.");
	}

}
