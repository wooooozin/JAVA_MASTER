package ch07;

public class MenualCar extends Car {

	@Override
	public void drive() {
		System.out.println("사람이 주행합니다.");
		System.out.println("사람이 방향을 전환합니다.");
	}

	@Override
	public void stop() {
		System.out.println("사람이 브레이크를 밟습니다.");
	}

	@Override
	public void fuel() {
		System.out.println("기름을 넣습니다.");
	}

}
