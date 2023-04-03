package ch08;

public class CalcTest {
	
	public static void main(String[] args) {
		
		CompleteCalc calcultor = new CompleteCalc();
		
		System.out.println(
		calcultor.add(10, 20) + " " +
		calcultor.subtract(10, 20) + " " +
		calcultor.times(10, 20) + " " +
		calcultor.divide(10, 20) + " " 
		);
		
	}
	
}
