package ch08;

public class CompleteCalc extends Calculator {

	@Override
	public int times(int a, int b) {
		return a * b;
	}

	@Override
	public int divide(int a, int b) {
		if (b != 0) {
			return a / b;
		} else {
			return Error;
		}
	}

}
