package ch10;

public abstract class Calculator implements Calc {

	@Override
	public int add(int a, int b) {
		return a + b;
	}

	@Override
	public int subtract(int a, int b) {
		return a - b;
	}

//	@Override
//	public int times(int a, int b) {
//		return a * b;
//	}
//
//	@Override
//	public int divide(int a, int b) {
//		// TODO Auto-generated method stub
//		return a / b;
//	}

}
