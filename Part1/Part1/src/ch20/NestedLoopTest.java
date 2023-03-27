package ch20;

public class NestedLoopTest {

	public static void main(String[] args) {
		
		//구구단
		// for
		
		int dan = 2;
		int count = 1;
		
		for (dan = 2; dan < 10; dan++) {
			System.out.println(dan + "단");
			for (count = 1; count < 10; count++) {
				System.out.println(dan + " X " + count + " = " + (dan * count));
			}
		}
		
		// while
		
		dan = 2;
		count = 1;
		
		while (dan < 10) {
			System.out.println(dan + "단 - while");
			count = 1;
			while (count < 10) {
				System.out.println(dan + " X " + count + " = " + (dan * count));
				count++;
			}
			dan++;
		}
		
	}

}
