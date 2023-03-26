package ch10;

public class TypeConversionTest {

	public static void main(String[] args) {
		
		byte bNum = 10;
		int iNum = bNum;  

		int iNum1 = 20;
		float fNum = iNum1;

		int iNum11 = 10;
		byte bNum1 = (byte)iNum11;
		System.out.println(bNum1);

		double dNum = 3.14;
		int iNum2 = (int)dNum;
		System.out.println(iNum2);

		// - 바이트 크기가 작은 자료형에서 큰 자료형으로 형 변환은 자동으로 이루어 짐
		// - 덜 정밀한 자료형에서 더 정밀한 자료형으로읜 형 변환은 자동으로 이루어 짐
	}

}
