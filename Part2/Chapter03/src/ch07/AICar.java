package ch07;

public class AICar extends Car {

	@Override
	public void drive() {

		System.out.println("자율주행합니다.");
		System.out.println("스스로 방향을 전환합니다..");

	}

	@Override
	public void stop() {

		System.out.println("스스로 멈춥니다.");
	}

	@Override
	public void fuel() {
		System.out.println("충전합니다.");
	}
	
	
	
}
