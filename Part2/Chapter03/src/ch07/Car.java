package ch07;

public abstract class Car {
	
	public abstract void drive();
	public abstract void stop();
	public abstract void fuel();
	
	public void startCar() {
		System.out.println("시동을 겁니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	public void washCar() { } // 훅 메서드 - 재정의 할 여지가 있는 메서드

	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();
		fuel();
	}
}
