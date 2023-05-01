package ch02_array;

public class MyArray {
	
	int[] intArr;
	int count;
	
	public int ARRAY_CAPACITY;
	public static final int ERROR_NUM = -999999999;

	public MyArray() { 
		count = 0;
		ARRAY_CAPACITY = 10;
		intArr = new int[ARRAY_CAPACITY];
	}
	
	public MyArray(int size) {
		count = 0;
		ARRAY_CAPACITY = size;
		intArr = new int[size];
	}
	
	public void addElement(int num) {
		if(count >= ARRAY_CAPACITY) {
			System.out.println("not enough memory")
			return;
		} 
		intArr[count++] = num;
	}
	
	public void insertElement(int position, int num) {
		if(count >= ARRAY_CAPACITY) {
			System.out.println("not enough memory")
			return;
		} 
		
		
		if(position < 0 || position > count ){  //index error
			System.out.println("insert Error");
			return;
		}
		
		for( int i = count-1; i >= position ; i--){
			intArr[i+1]  = intArr[i];        // 하나씩 이동
		}
		
		intArr[position] = num;
		count++;
	}
	
	public int removeElement(int position) {
		int ret = ERROR_NUM;
		
	}
	
	public int getSize() {
		return count;
	}
	
}
