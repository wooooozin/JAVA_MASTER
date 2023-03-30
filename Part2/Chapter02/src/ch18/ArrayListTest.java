package ch18;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {

		ArrayList<Book> library = new ArrayList<Book>();
		
		for (int i = 0; i < 5; i++) {
			library.add(new Book("뽀로로친구" + i,"루피"));  // 더하기 add()
		}
		
		for (int i = 0; i < library.size(); i++) {
			library.get(i).showBookInfo(); // 접근 get()
		}
		
		library.remove(1);
		
		for (int i = 0; i < library.size(); i++) {
			library.get(i).showBookInfo(); // 삭제 remove()
		}
		
		System.out.println(library.isEmpty()); // fasle
		
		library.removeAll(library);
		
		System.out.println(library.isEmpty()); // true
		
	}

}
