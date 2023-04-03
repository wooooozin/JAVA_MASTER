package ch08;

public interface Calc {
	// 인터페이스 - 모든 메서드가 추상 메서드로 선언됨 public abstract
	// - 모든 변수는 상수로 선언됨 public static final
	
	public static final double PI = 3.14;
	int Error = -99999;
	
	public abstract int add(int a, int b);
	int subtract(int a, int b);
	int times(int a, int b);
	int divide(int a, int b);
}
