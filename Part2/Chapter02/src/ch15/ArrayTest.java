package ch15;

public class ArrayTest {

	public static void main(String[] args) {

		// 배열 선언하기
		int[] arr1 = new int[10];
		int arr2[] = new int[10];
		
		// 배열 초기화 하가
		int[] numbers1 = new int[] {10, 20, 30};
		int[] numbers2 = {10, 20, 30}; // new int[] 생략가능
		int[] ids; 
		ids = new int[] {10, 20, 30}; // 선언후 배열을 생성한다면 new int[] 생략 불가
		
		// 배열을 이용해 합 구하기
		int total = 0;
		
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = i + 1;
		}
		
		for (int i = 0; i < arr1.length; i++) {
			total += arr1[i];
		}
		
		System.out.println(total);
		
		// 문자 배열을 만들어 A-Z 까지 배열에 저장하고 이를 다시 출력하기
		
		char[] alphabets = new char[26];
		char ch = 'A';
		
		for (int i = 0; i < alphabets.length; i++) {
			alphabets[i] = ch++;
		}
		
		for (int i = 0; i < alphabets.length; i++) {
			System.out.print(alphabets[i]);
		}
		System.out.println();
		for (char chars : alphabets) {
			System.out.print(chars);
		}
	}

}
