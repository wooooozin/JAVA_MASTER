package ch10;

public interface Calc {
	// 인터페이스 - 모든 메서드가 추상 메서드로 선언됨 public abstract
	// - 모든 변수는 상수로 선언됨 public static final
	
	// 상수 (static)
	public static final double PI = 3.14;
	int Error = -99999;
	
	// 추상메서
	public abstract int add(int a, int b);
	int subtract(int a, int b);
	int times(int a, int b);
	int divide(int a, int b);
	
	// default method - 구현을 가지는 메서드, 인터페이스를 구현하는 클래스들에서 공통으로 사용할 수 있는 기본 메서드
	
	default void description() {
		myMethod();
		System.out.println("정수를 계산합니다.");
	}
	
	// private method - 인터페이스 내부에서만 사용하기 위해 구현하는 메서드
	private void myMethod() {
		System.out.println("myMethod");
	}
	
	// stactic method - 인스턴스 생성과 상관 없이 인터페이스 타입으로 사용할 수 있는 메서드
	static int total(int[] arr) {
		int total = 0;
		for(int i : arr) {
			total += i;
		}
		return total;
	}
	
}
